import './App.css'
import Navbar from './components/navbar'
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
          <div class='center'>
            <Login />
          </div>
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
