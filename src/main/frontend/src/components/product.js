import React, { useState, useEffect } from 'react'
import Table from 'react-bootstrap/Table'
import DropdownButton from 'react-bootstrap/DropdownButton'
import Dropdown from 'react-bootstrap/Dropdown'

function Product() {
  const [state, setstate] = useState({ product: [] })

  const getproduct = async () => {
    const response = await fetch('/products')
    const body = await response.json()
    //console.log(body)
    setstate({ product: body })
  }

  useEffect(() => {
    getproduct()
  }, [])
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
                <Dropdown.Item eventKey='1'>Edit</Dropdown.Item>
                <Dropdown.Item eventKey='2'>Delete</Dropdown.Item>
              </DropdownButton>
            </td>
          </tr>
        ))}
      </tbody>
    </Table>
  )
}
export default Product
