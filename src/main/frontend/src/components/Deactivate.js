import React from 'react'
import { Form, Row, Col } from 'react-bootstrap'
import { useLocation } from 'react-router-dom'

const Deactivate = () => {
  const location = useLocation()

  return (
    <Form>
      <Row className='mb-3'>
        <Form.Group as={Col}>
          <Form.Label>Dasactivate this product</Form.Label>
          <Form.Control value={location.description} />
        </Form.Group>
      </Row>
    </Form>
  )
}
export default Deactivate
