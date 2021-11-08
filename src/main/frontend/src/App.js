import './App.css'
import Navbar from './components/Navbar'
import Login from './components/Login'
import Product from './components/product'
import Error from './components/error'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import EditProduct from './components/EditProduct'
import Home from './components/home'
import Showproduct from './components/Showproduct'
import AddProduct from './components/AddProduct'
import Deactivate from './components/Deactivate'
import Navbarr from './components/Navbar'

function App() {
  return (
    <Router>
      <Navbarr />
      <Switch>
        <Route exact path='/'>
          <div class='center'>
            <Login />
          </div>
        </Route>
        <Route path='/home'>
          <Home />
        </Route>
        <Route path='/showproduct'>
          <Showproduct />
        </Route>
        <Route path='/product'>
          <Product />
        </Route>
        <Route path='/deactive'>
          <Deactivate />
        </Route>
        <Route path='/editproduct'>
          <EditProduct />
        </Route>
        <Route path='/addproduct'>
          <AddProduct />
        </Route>
        <Route path='*'>
          <Error />
        </Route>
      </Switch>
    </Router>
  )
}
export default App
