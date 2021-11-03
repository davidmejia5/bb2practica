import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
import Navbar from 'react-bootstrap/Navbar'
import Container from 'react-bootstrap/Container'
import Nav from 'react-bootstrap/Nav'

function navbar() {
  return (
    <Navbar bg='primary' variant='dark'>
      <Container>
        <Navbar.Brand href='/'>Ikea</Navbar.Brand>
        <Nav className='me-auto'>
          <Nav.Link href='/'>Home</Nav.Link>
          <Nav.Link href='/login'>Sign up</Nav.Link>
        </Nav>
      </Container>
    </Navbar>
  )
}
export default navbar
