import React, { useState } from 'react';
import '../App.css';

function Counter() {
  const [count, setCount] = useState(0);

  const incrementCount = () => {
    setCount(prevCount => prevCount + 1);
  };

  const sayHello = () => {
    alert('Hello Member!!');
  };

  const handleIncrementClick = () => {
    incrementCount();
    sayHello();
  };

  const handleDecrementClick = () => {
    setCount(prevCount => prevCount - 1);
  };

  const sayWelcome = () => {
    alert("Welcome");
  };

  const clickMe = () => {
    alert("I was clicked");
  }

  return (
    <div>
      <h2 className='count'>{count}</h2>
      <button onClick={handleIncrementClick} className='Button'>Increment</button>
      <br/>
      <button onClick={handleDecrementClick} className='Button'>Decrement</button>
      <br/>
      <button onClick={sayWelcome} className='Button'>Say Welcome</button>
      <br/>
      <button onClick={clickMe} className='Button'>Click on me</button>
    </div>
  );
}

export default Counter;
