"use client";

import { useEffect, useState } from 'react';
import userService from '../../services/user_service';
import { User } from '../../models/User';
function AdminPage() {
  const [user, setUser] = useState<User | null>(null);

  useEffect(() => {
    const userData = JSON.parse(localStorage.getItem('userData') || '{}');
    const { username } = userData;

    const fetchUserData = async () => {
      try {
        const userData = await userService.getUserByUsername(username);
        setUser(userData);
      } catch (error) {
        console.error('Error al obtener los datos del usuario:', error);
      }
    };

    fetchUserData();
  }, []);

  return (
    <div>
      <h1>Página de administración</h1>
      {user ? (
        <div>
          <p>ID Usuario: {user.idUser}</p>
          <p>Usuario: {user.username}</p>
          <p>Email: {user.email}</p>
          <p>Roles: {user.roles.join(', ')}</p>
          <p>Password: {user.password}</p>
          {/* Renderiza otras propiedades del usuario según sea necesario */}
        </div>
      ) : (
        <p>Cargando datos del usuario...</p>
      )}
    </div>
  );
}

export default AdminPage;
