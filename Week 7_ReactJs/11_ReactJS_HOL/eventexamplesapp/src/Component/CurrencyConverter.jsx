import React, { useState } from 'react';
import "../App.css";

const CurrencyConverter = () => {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleAmount = (e) => {
    setAmount(e.target.value);
  };

  const handleCurrency = (e) => {
    setCurrency(e.target.value);
  };

  const convertDisplay = () => {
    const rateToEuro = 0.0100; 
    const numericAmount = parseFloat(amount);

    if (isNaN(numericAmount)) {
      alert('Please enter a valid numeric amount.');
      return;
    }

    const converted = numericAmount * rateToEuro;
    alert('Converting to ' + currency + ' Amount is ' + converted);
  };

  return (
    <div>
      <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>

      <div className="form-row">
        <span className="form-label">Amount:</span>
        <input type="text" onChange={handleAmount} />
      </div>

      <div className="form-row">
        <span className="form-label">Currency:</span>
        <textarea rows="3" cols="30" onChange={handleCurrency} />
      </div>

      <div className="button-row">
        <button onClick={convertDisplay}>Submit</button>
      </div>
    </div>
  );
};

export default CurrencyConverter;
