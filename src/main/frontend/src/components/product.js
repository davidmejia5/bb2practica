import React, { useState, useEffect } from 'react'
import { DropdownButton, Table, Dropdown, Button } from 'react-bootstrap'
import { useHistory } from 'react-router-dom'

function Product() {
  const [state, setstate] = useState({ product: [] })
  const [flag, setFlag] = useState(false)
  const history = useHistory()

  const getproduct = async () => {
    const response = await fetch('/products')
    const body = await response.json()
    console.log(body)
    setstate({ product: body })
  }
  const addProduct = () => {
    history.push('/addproduct')
  }

  const deleteProduct = async (productId) => {
    const url = '/products/delete/' + productId
    const options = {
      method: 'POST',
    }
    fetch(url, options)
    setFlag(true)
  }

  const showProduct = (prod) => {
    history.push({
      pathname: '/showproduct',
      state: prod,
    })
  }

  const editProduct = (prod) => {
    history.push({
      pathname: '/editproduct',
      state: prod,
    })
  }

  const deactive = (prod) => {
    /* const url = '/products/changestate/' + productid
    const options = {
      method: 'POST',
    }
    fetch(url, options) */
    console.log('aaaaaaaaaaaaaaaaaaaaaaaaaaaaa')
    history.push({
      pathname: '/deactive',
      state: prod,
    })
  }

  useEffect(() => {
    if (!localStorage.getItem('user')) {
      history.push('/')
    }
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
          <th>
            <Button variant='primary' onClick={() => addProduct()}>
              Add
            </Button>
          </th>
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
              <Button variant='primary' onClick={() => deactive(product)}>
                DISCOUNTED
              </Button>
            </td>
            <td>
              <DropdownButton
                //as={ButtonGroup}
                title='Options'
                id='bg-vertical-dropdown-1'
              >
                <Dropdown.Item
                  eventKey='1'
                  onClick={() => editProduct(product)}
                >
                  Edit
                </Dropdown.Item>
                <Dropdown.Item
                  eventKey='2'
                  onClick={() => showProduct(product)}
                >
                  Show Info
                </Dropdown.Item>
                <Dropdown.Item
                  eventKey='3'
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
