import React, { useState, useEffect } from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
import Navbar from 'react-bootstrap/Navbar'
import Container from 'react-bootstrap/Container'
import Nav from 'react-bootstrap/Nav'

function Navbarr() {
  const [login, setLogin] = useState('Sign up')

  const logout = () => {
    localStorage.removeItem('user')
  }

  useEffect(() => {
    if (localStorage.getItem('user')) {
      setLogin('Log out')
    }
  }, [login])

  return (
    <Navbar bg='primary' variant='dark'>
      <Container>
        <Navbar.Brand href='/'>Ikea</Navbar.Brand>
        <Nav className='me-auto'>
          <Nav.Link href='/'>Home</Nav.Link>
          <Nav.Link href='/home' onClick={() => logout()}>
            {login}
          </Nav.Link>
        </Nav>
      </Container>
    </Navbar>
  )
}
export default Navbarr
