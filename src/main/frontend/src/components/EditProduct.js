import React, { useState, useEffect } from 'react'
import { Form, Row, Button, Col } from 'react-bootstrap'
import { useLocation } from 'react-router-dom'

function EditProduct() {
  const location = useLocation()
  console.log(location.state)
  const [item, setItem] = useState(location.state)

  const saveProduct = async () => {}

  const handleSumit = (e) => {
    e.preventDefault()
    console.log('item', item)
    saveProduct()
  }

  const handleInputChange = (e) => {
    const { name, value } = e.target
    setItem({
      ...item,
      [name]: value,
    })
  }

  return (
    <div>
      <h1>{location.state.description}</h1>
      <Form>
        <Row className='mb-3'>
          <Form.Group as={Col}>
            <Form.Label>Description</Form.Label>
            <Form.Control
              name='description'
              placeholder='Enter description'
              value={item.description}
              onChange={handleInputChange}
            />
          </Form.Group>

          <Form.Group as={Col}>
            <Form.Label>Date</Form.Label>
            <Form.Control
              value={item.creationDate}
              placeholder='Date'
              onChange={handleInputChange}
            />
          </Form.Group>
        </Row>

        <Form.Group as={Col} controlId='formGridState'>
          <Form.Label>State</Form.Label>
          <Form.Select
            name='state'
            defaultValue={item.productState}
            onChange={handleInputChange}
          >
            <option>ACTIVE</option>
            <option>DISCOUNTED</option>
          </Form.Select>
        </Form.Group>

        <Form.Group className='mb-3'>
          <Form.Label>Supplier List</Form.Label>
          <Form.Control
            value={item.supplierList.map((supplier) => supplier.name + ', ')}
            onChange={handleInputChange}
            placeholder='Empty'
          />
        </Form.Group>

        <Form.Group className='mb-3' controlId='formGridAddress2'>
          <Form.Label>Pice Reduction</Form.Label>
          <Form.Control
            onChange={handleInputChange}
            value={item.priceReductionList.map(
              (reduction) => reduction.reducePrice
            )}
            placeholder='Empty'
          />
        </Form.Group>

        <Button variant='primary' type='submit' onClick={handleSumit}>
          Submit
        </Button>
      </Form>
    </div>
  )
}
export default EditProduct
