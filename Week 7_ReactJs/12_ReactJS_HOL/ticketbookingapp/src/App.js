import React, { useState } from 'react';
import './App.css';
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const login = () => setIsLoggedIn(true);
  const logout = () => setIsLoggedIn(false);

  const GuestPage = () => (
    <div >
      <h2>Guest Page</h2>
      <p>Flight Details:</p>
      <ul>
        <li>Flight 1 - Newyork to Delhi</li>
        <li>Flight 2 - Chennai to Singapore</li>
      </ul>
      <button onClick={login}>Login</button>
    </div>
  );

  const UserPage = () => (
    <div>
      <h2>User Page</h2>
      <p>Book your tickets here.</p>
      <ul>
        <li>Flight 1 <button>Book Now</button></li>
        <li>Flight 2 <button>Book Now</button></li>
      </ul>
      <button onClick={logout}>Logout</button>
    </div>
  );

  return (
    <div className='App'>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? <UserPage /> : <GuestPage />}
    </div>
  );
}

export default App;
