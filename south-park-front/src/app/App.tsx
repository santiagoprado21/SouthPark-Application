import React, { useEffect } from 'react';
import './App.css';
import { booking_service } from '@/services/booking_service';

const App: React.FC = () => {
  const bookingService = new booking_service

  useEffect(() => {
    bookingService.getAll().then(data => {
      console.log(data);
    });
  }, []);

  return <h1>Hola mundo</h1>;
};

export default App;