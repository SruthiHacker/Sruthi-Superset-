// src/OnlineShopping.js
import React, { Component } from "react";
import Cart from "./Cart";

class OnlineShopping extends Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [
        new Cart("T-Shirt", 499),
        new Cart("Jeans", 999),
        new Cart("Sneakers", 1499),
        new Cart("Backpack", 799),
        new Cart("Sunglasses", 399),
      ],
    };
  }

  render() {
    return (
      <div>
        <h2>🛒 Online Shopping Cart</h2>
        <ul>
          {this.state.items.map((item, index) => (
            <li key={index}>
              <strong>Item:</strong> {item.itemname} — <strong>Price:</strong> ₹{item.price}
            </li>
          ))}
        </ul>
      </div>
    );
  }
}

export default OnlineShopping;
