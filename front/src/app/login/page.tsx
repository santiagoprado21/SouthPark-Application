"use client";

import React, { useState } from 'react';
import authService from '@/services/auth.service';
import {jwtDecode} from 'jwt-decode';
import axios from 'axios';

// Define the DecodedToken interface
interface DecodedToken {
  sub: string;
  authorities: { authority: string }[];
  iat: number;
  exp: number;
}

function LoginPage () {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [loading, setLoading] = useState(false);
  const [message, setMessage] = useState('');
  
  const handleLogin = async (e: React.FormEvent) => {
    e.preventDefault();
    setLoading(true);
    try {
      const data = await authService.login(username, password);
      //console.log('Response:', data);
      const { token } = data;

      // Decode the token with the DecodedToken interface
      const decodedToken = jwtDecode<DecodedToken>(token);
      //console.log('Decoded Token:', decodedToken); // Print the decoded token to the console

      // Extract the user role from the authorities
      const userRole = decodedToken.authorities[0].authority;
      //console.log('Role: ', userRole);

      const userData = {
        token: token,
        role: userRole,
        username: username,
      };
      localStorage.setItem('userData', JSON.stringify(userData));
      //axios.defaults.headers.common['Authorization'] = 'Bearer ',{token};

      if (userRole === 'ROLE_ADMIN') {
        window.location.href = "http://localhost:3000/admin"
      } else if (userRole === 'ROLE_USER') {
        window.location.href = "http://localhost:3000"
      } else if (userRole === 'ROLE_INVITED') {
        window.location.href = "http://localhost:3000/invited"
      } 

    } catch (error) {
      setMessage('Error al iniciar sesión');
      console.error(error);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div>
      <h1>Iniciar Sesión</h1>
      <form onSubmit={handleLogin}>
        <div>
          <label htmlFor="username">Usuario:</label>
          <input
            type="text"
            id="username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />
        </div>
        <div>
          <label htmlFor="password">Contraseña:</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <button type="submit" disabled={loading}>
          {loading ? 'Cargando...' : 'Iniciar Sesión'}
        </button>
        {message && <div>{message}</div>}
      </form>
    </div>
  );
};

export default LoginPage;
