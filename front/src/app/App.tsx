import React, { useEffect } from 'react';
import './App.css';
import { booking_service } from '@/services/booking_service';
import MainPage from '@/components/MainPage/page';

const App = () => {
  const bookingService = new booking_service();

  useEffect(() => {
    bookingService.getAll().then(data => {
      console.log(data);
    });
  }, []);

  return (
    <div>
      <MainPage />
    </div>
  );
};

export default App;