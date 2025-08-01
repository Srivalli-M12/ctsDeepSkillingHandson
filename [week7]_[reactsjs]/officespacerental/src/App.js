import React from "react";
import "./App.css";
import officeImage from './office.jpg';

function App() {
  // Step 3: Define office data
  const offices = [
    {
      name: "Office A",
      rent: 55000,
      address: "MG Road, Bangalore",
      image:officeImage
    },
    {
      name: "Office B",
      rent: 65000,
      address: "Gachibowli, Hyderabad",
      image: officeImage
    }
  ];

  return (
    <div className="App">
      {/* Step 4: Page Heading */}
      <h1>Office Space Rental</h1>

      {/* Step 5: Loop Through Office Data */}
      {offices.map((office, index) => (
        <div key={index} style={{ border: "1px solid gray", margin: "10px", padding: "10px" }}>
          <img src={office.image} alt={office.name} width="200" />
          <h2>{office.name}</h2>
          <p>{office.address}</p>
          <p style={{ color: office.rent > 60000 ? "green" : "red" }}>
            Rent: ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
