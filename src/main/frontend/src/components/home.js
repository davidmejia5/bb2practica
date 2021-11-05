import React from 'react'
import Nav from 'react-bootstrap/Nav'

const Home = () => {
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
