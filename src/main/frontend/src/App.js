import React, { Component } from "react";
import logo from './logo.svg';
import './App.css';

class App extends Component{
  state = {
      product: []
  }

  async componentDidMount(){
      const response = await fetch('/products');
      const body = await response.json();
      this.setState({product: body});
  }

  render(){
      const {product} = this.state;
      return (
          <div className="App">
              <header className="App-header">
                  <img src={logo} className="App-logo" alt="logo" />
                      <div className="App-intro">
                          <h2>Products</h2>
                          {product.map(product =>
                      <div key={product.idproduct}>
                      {product.description} {product.price} ({product.creationDate})
                </div>
              )}
              </div>
            </header>
          </div>
      );
  }
}
export default App;
