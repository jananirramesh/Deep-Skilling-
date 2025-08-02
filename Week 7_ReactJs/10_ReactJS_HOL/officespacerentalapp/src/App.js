import React from "react";
import "./App.css";

const officeImage = "https://5.imimg.com/data5/AX/LK/HL/SELLER-56879336/office-space-for-rent-500x500.jpg";

const officeList = [
  {
    name: "Office Space",
    rent: 45000,
    address: "Mumbai"
  },
  {
    name: "Elite Business Hub",
    rent: 75000,
    address: "Bangalore"
  },
  {
    name: "Startup Space",
    rent: 58000,
    address: "Chennai"
  }
];

function App() {
  return (
    <div className="App">
      <h1>Office Space, at Affordable Range</h1>

      <img src={officeImage} alt="Office space" style={{ width: "600px", height: "300px" }} />

      <div>
        {officeList.map((office, index) => (
          <div key={index} style={{ marginTop: "20px", padding: "10px", border: "1px solid #ccc", borderRadius: "8px" }}>
            <h2>{office.name}</h2>
            <p>
              <strong>Rent:</strong>{" "}
              <span style={{ color: office.rent > 60000 ? "green" : "red" }}>
                ₹{office.rent}
              </span>
            </p>
            <p><strong>Address:</strong> {office.address}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
