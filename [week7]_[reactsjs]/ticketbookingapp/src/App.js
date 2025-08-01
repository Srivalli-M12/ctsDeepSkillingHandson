import { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';
import LoginButton from './LoginButton';
import LogoutButton from './LogoutButton';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div className="App">
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <>
          <UserPage />
          <LogoutButton onClick={handleLogout} />
        </>
      ) : (
        <>
          <GuestPage />
          <LoginButton onClick={handleLogin} />
        </>
      )}
    </div>
  );
}

export default App;
