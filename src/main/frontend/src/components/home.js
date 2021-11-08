import React, { useState, useEffect } from 'react'
import Nav from 'react-bootstrap/Nav'
import { useHistory } from 'react-router-dom'

const Home = () => {
  const history = useHistory()

  useEffect(() => {
    if (!localStorage.getItem('user')) {
      history.push('/')
    }
  }, [])

  return (
    <Nav defaultActiveKey='' className='flex-column'>
      <Nav.Link href='/product'>Products</Nav.Link>
      {/*       <Nav.Link eventKey='link-1'>Link</Nav.Link> */}
      <Nav.Link eventKey='disabled' disabled>
        Show Users
      </Nav.Link>
    </Nav>
  )
}
export default Home
