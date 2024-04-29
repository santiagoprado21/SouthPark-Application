import React from 'react';
import LoginPage from './login';
import LogoutButton from './logoutButton';
import Profile from './profile';
import { useAuth0 } from '@auth0/auth0-react';

const Home = () => {

    const{isAuthenticated} = useAuth0()


  return (
    <div>
      <h1>Página de inicio</h1>
      {isAuthenticated ? <LogoutButton/> : <LoginPage />}      
      <Profile/>
    </div>
  );
};

export default Home;