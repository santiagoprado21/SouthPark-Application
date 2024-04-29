import React from 'react';
import { useAuth0 } from '@auth0/auth0-react';

const Login = () => {
  const { loginWithRedirect, isAuthenticated } = useAuth0();

  return (
    <div>
      <h1>Inicia sesión</h1>
      <button onClick={loginWithRedirect}>Iniciar sesión</button>
    </div>
  );
};

export default Login;