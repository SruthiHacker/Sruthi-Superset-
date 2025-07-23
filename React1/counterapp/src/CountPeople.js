// src/CountPeople.js
import React, { Component } from "react";

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0,
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entryCount: prevState.entryCount + 1,
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitCount: prevState.exitCount + 1,
    }));
  };

  render() {
    return (
      <div style={{ padding: "20px", textAlign: "center" }}>
        <h2>🧍‍♂️ Mall Entry Counter</h2>
        <p><strong>Number of People Entered:</strong> {this.state.entryCount}</p>
        <p><strong>Number of People Exited:</strong> {this.state.exitCount}</p>
        <button onClick={this.updateEntry} style={{ margin: "10px", padding: "10px 20px" }}>
          Login
        </button>
        <button onClick={this.updateExit} style={{ margin: "10px", padding: "10px 20px" }}>
          Exit
        </button>
      </div>
    );
  }
}

export default CountPeople;
