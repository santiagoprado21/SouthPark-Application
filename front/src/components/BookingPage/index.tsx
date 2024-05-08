"use client";

import 'primereact/resources/themes/saga-blue/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';

import React from 'react';
import BookingDataTable from './BookingDataTable';
import { Panel } from 'primereact/panel';

const BookingPage = () => {
  return (
    <Panel header="Booking Page" style={{width:'80%', marginTop: '20px', margin: '0 auto'}}>

      <BookingDataTable />
      {/* Otros componentes o lógica de la página */}
    </Panel>
  );
};

export default BookingPage;

