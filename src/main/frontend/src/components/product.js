import React, { useState, useEffect } from 'react'
import Table from 'react-bootstrap/Table'
import DropdownButton from 'react-bootstrap/DropdownButton'
import Dropdown from 'react-bootstrap/Dropdown'
import { useHistory } from 'react-router-dom'

function Product() {
  const [state, setstate] = useState({ product: [] })
  const [flag, setFlag] = useState(false)
  const history = useHistory()

  const getproduct = async () => {
    const response = await fetch('/products')
    const body = await response.json()
    setstate({ product: body })
  }

  const deleteProduct = async (productId) => {
    const url = '/products/delete/' + productId
    const options = {
      method: 'POST',
    }
    fetch(url, options)
    setFlag(true)
  }

  const editProduct = () => {
    history.push(`/editproduct/${product.idProduct}`)
  }

  useEffect(() => {
    getproduct()
    setFlag(false)
  }, [flag])

  const { product } = state
  return (
    <Table striped bordered hover>
      <thead>
        <tr>
          <th># Id</th>
          <th>Description</th>
          <th>Price</th>
          <th>State</th>
        </tr>
      </thead>
      <tbody>
        {product.map((product) => (
          <tr key={product.idProduct}>
            <td>{product.idProduct}</td>
            <td>{product.description}</td>
            <td>{product.price} €</td>
            <td>{product.productState}</td>
            <td>
              <DropdownButton
                //as={ButtonGroup}
                title='Options'
                id='bg-vertical-dropdown-1'
              >
                <Dropdown.Item
                  eventKey='1'
                  onClick={() => editProduct(product.idProduct)}
                >
                  Edit
                </Dropdown.Item>
                <Dropdown.Item
                  eventKey='2'
                  onClick={() => deleteProduct(product.idProduct)}
                >
                  Delete
                </Dropdown.Item>
              </DropdownButton>
            </td>
          </tr>
        ))}
      </tbody>
    </Table>
  )
}
export default Product
