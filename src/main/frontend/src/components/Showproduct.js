import React from 'react'
import { Card, ListGroup, ListGroupItem } from 'react-bootstrap'
import { useLocation } from 'react-router-dom'

function Showproduct() {
  const location = useLocation()

  //To do: imagenes por producto

  return (
    <div style={{ display: 'flex', justifyContent: 'center' }}>
      <Card style={{ width: '18rem' }}>
        <Card.Img
          variant='top'
          src='https://th.bing.com/th/id/R.3d55f4fe30bc6c5008d015cb37b8a16b?rik=cO6jt4AlXtF10w&pid=ImgRaw&r=0'
        />
        <Card.Body>
          <Card.Title>{location.state.description}</Card.Title>
          <Card.Text>
            Some quick example text to build on the card title and make up the
            bulk of the card's content.
          </Card.Text>
        </Card.Body>
        <ListGroup className='list-group-flush'>
          <ListGroupItem>ID: {location.state.idProduct}</ListGroupItem>
          <ListGroupItem>Date: {location.state.creationDate}</ListGroupItem>
          <ListGroupItem>Price: {location.state.price}</ListGroupItem>
          <ListGroupItem>Vestibulum at eros</ListGroupItem>
        </ListGroup>
        <Card.Body>
          <Card.Link href='#'>Card Link</Card.Link>
          <Card.Link href='#'>Another Link</Card.Link>
        </Card.Body>
      </Card>
    </div>
  )
}
export default Showproduct
