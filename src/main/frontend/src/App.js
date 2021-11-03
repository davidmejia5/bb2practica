import './App.css'
import Navbar from './components/navbar'
import Home from './components/home'
import Login from './components/login'
import Product from './components/product'
import Error from './components/error'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'

function App() {
  return (
    <Router>
      <Navbar />
      <Switch>
        <Route exact path='/'>
          <Home />
        </Route>
        <Route path='/login'>
          <Login />
        </Route>
        <Route path='/product'>
          <Product />
        </Route>
        <Route path='*'>
          <Error />
        </Route>
      </Switch>
    </Router>
  )
}
export default App
