import React, { Component, useState, useEffect } from 'react'
import logo from './logo.svg'
import './App.css'
import Dashboard from '../Dashboard/Dashboard'
import Preferences from '../Preferences/Preferences'
import { BrowserRouter, Route, Switch } from 'react-router-dom'

function App() {
  const [state, setstate] = useState({ product: [] })

  const getproduct = async () => {
    const response = await fetch('/products')
    const body = await response.json()
    setstate({ product: body })
  }

  getproduct()

  const { product } = state
  return (
    <div className='App'>
      <header className='App-header'>
        <img src={logo} className='App-logo' alt='logo' />
        <div className='App-intro'>
          <h2>Products</h2>
          {product.map((product) => (
            <div key={product.idproduct}>
              {product.description} {product.price} ({product.creationDate})
            </div>
          ))}
        </div>
      </header>
    </div>
  )
}
export default App
