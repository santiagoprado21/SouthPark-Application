import React, { useEffect } from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css';
import { booking_service } from '@/services/booking_service';
import LoginPage from './login/page';
import AdminPage from './admin/page';

const App = () => {
  const bookingService = new booking_service();

  useEffect(() => {
    bookingService.getAll().then(data => {
      console.log(data);
    });
  }, []);

  return (
    <div className="">
      <Router>
        <Routes>
          <Route path="/login" element={<LoginPage />} />
          <Route path="/admin" element={<AdminPage />} />
        </Routes>
      </Router>

    </div>
  );
};

export default App;