import React, { useEffect, useState } from 'react';
import { fetchData } from '../services/api';

const Booking = () => {
    const [data, setData] = useState([]);
  
    useEffect(() => {
      const fetchAndSetData = async () => {
        try {
          const fetchedData = await fetchData();
          setData(fetchedData);
        } catch (error) {
          console.error('Error fetching data:', error);
        }
      };
  
      fetchAndSetData();
    }, []);
  
    return (
      <div>
        <h1>Página de Booking</h1>
        <ul>
          {data.map((item) => (
            <li key={item.id}>{item.name}</li>
          ))}
        </ul>
      </div>
    );
  };
  
  export default Booking;