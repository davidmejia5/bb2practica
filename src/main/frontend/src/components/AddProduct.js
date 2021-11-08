import React, { useState, useEffect } from 'react'
import { Form, Row, Button, Col } from 'react-bootstrap'

function AddProduct() {
  const [state, setState] = useState({
    id: '',
    description: '',
    price: '',
  })

  const handleInputChange = (e) => {
    const { id, description, price } = e.target
    /* setState({
        ...item,
        [name]: value,
    }) */
  }

  const handleSumit = (e) => {
    e.preventDefault()
    //console.log('item', item)
    //saveProduct()
  }

  return (
    <div>
      <Form>
        <Row className='mb-3'>
          <Form.Group as={Col}>
            <Form.Label>Description</Form.Label>
            <Form.Control
              name='description'
              value={state.description}
              placeholder='Enter description'
              onChange={handleInputChange}
            />
          </Form.Group>

          <Form.Group as={Col}>
            <Form.Label>ID</Form.Label>
            <Form.Control
              placeholder='ID'
              value={state.id}
              onChange={handleInputChange}
            />
          </Form.Group>

          <Form.Group className='mb-3'>
            <Form.Label>Product ID</Form.Label>
            <Form.Control
              value={state.price}
              onChange={handleInputChange}
              placeholder='Empty'
            />
          </Form.Group>
        </Row>

        <Form.Group className='mb-3' controlId='formGridAddress2'>
          <Form.Label>Pice Reduction</Form.Label>
          <Form.Control onChange={handleInputChange} placeholder='Empty' />
        </Form.Group>

        <Button variant='primary' type='submit' onClick={handleSumit}>
          Submit
        </Button>
      </Form>
    </div>
  )
}
export default AddProduct
