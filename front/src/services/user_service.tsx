import axios from 'axios';

const getUserByUsername = async (username: String) => {
  try {
    const response = await axios.get(`http://localhost:9093/users/${username}`);
    return response.data;
  } catch (error) {
    console.error('Error al obtener los datos del usuario:', error);
    throw error;
  }
};

const userService = {
  getUserByUsername,
};

export default userService;
