import React, { useState } from 'react';

function App() {
  // State for counter
  const [count, setCount] = useState(0);

  // State for currency converter
  const [inr, setInr] = useState(0);
  const [euro, setEuro] = useState(0);

  // Increment function (also calls sayHello)
  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  // Decrement function
  const decrement = () => {
    setCount(count - 1);
  };

  // Function for static message
  const sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  // Function with argument
  const sayWelcome = (msg) => {
    alert(msg);
  };

  // Synthetic event handler
  const handleClick = (event) => {
    alert("I was clicked");
    console.log("Synthetic Event Type:", event.type);
  };

  // Currency conversion logic
  const handleConvert = () => {
    const rate = 0.011; // Example rate: 1 INR = 0.011 EUR
    setEuro((inr * rate).toFixed(2));
  };

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial' }}>
      <h1>React Event Handling Example</h1>

      {/* Counter Section */}
      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <br /><br />

      {/* Say Welcome */}
      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>

      <br /><br />

      {/* Synthetic Event Example */}
      <button onClick={(e) => handleClick(e)}>Click Me</button>

      <br /><br />

      {/* Currency Converter */}
      <h2>Currency Converter (INR → EUR)</h2>
      <input
        type="number"
        onChange={(e) => setInr(e.target.value)}
        placeholder="Enter INR"
      />
      <button onClick={handleConvert}>Convert</button>
      <p>{inr} INR = {euro} EUR</p>
    </div>
  );
}

export default App;
