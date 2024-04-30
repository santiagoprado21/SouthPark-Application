import axios from 'axios';

const API_BASE_URL = 'http://localhost:9093';

export const fetchData = async () => {
  try {
    const response = await axios.get(`${API_BASE_URL}/api/data`);
    return response.data;
  } catch (error) {
    console.error('Error fetching data:', error);
    throw error;
  }
};