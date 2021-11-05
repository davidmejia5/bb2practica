import React, { useState, useEffect } from 'react'
import Form from 'react-bootstrap/Form'
import Button from 'react-bootstrap/Button'
import { useHistory } from 'react-router-dom'

function Login(props) {
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')
  const [client, setClient] = useState({ user: [] })
  const history = useHistory()

  const searchEmail = async () => {
    const url = '/user/' + email
    const response = await fetch(url)
    const data = await response.json()
    // console.log(data)
    setClient({ user: data })
  }

  const { user } = client
  const handleSumit = (e) => {
    e.preventDefault()

    searchEmail()
    if (user.email === email && user.password === password) {
      localStorage.setItem('user', JSON.stringify(user))
      history.push('/home')
    }
    //To do: Mensaje error para usuario invalido
  }

  useEffect(() => {
    if (localStorage.getItem('user')) {
      history.push('/home')
    }
    console.log(localStorage.getItem('user'))
  }, [])

  return (
    <Form>
      <Form.Group className='mb-3' controlId='formBasicEmail'>
        <Form.Label>Email address</Form.Label>
        <Form.Control
          type='email'
          placeholder='Enter email'
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <Form.Text className='text-muted'>
          We'll never share your email with anyone else.
        </Form.Text>
      </Form.Group>
      <Form.Group className='mb-3' controlId='formBasicPassword'>
        <Form.Label>Password</Form.Label>
        <Form.Control
          type='password'
          placeholder='Password'
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
      </Form.Group>
      <Form.Group className='mb-3' controlId='formBasicCheckbox'>
        <Form.Check type='checkbox' label='Check me out' />
      </Form.Group>
      <Button variant='primary' type='submit' onClick={handleSumit}>
        Submit
      </Button>
    </Form>
  )
}

export default Login
