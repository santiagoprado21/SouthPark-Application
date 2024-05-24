"use client";

import 'primereact/resources/themes/saga-blue/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';
import BookingDataTable from '../BookingDataTable/BookingDataTable';
import { Panel } from 'primereact/panel';
import React from 'react';

const MyBookingPage = () => {
  return (
    <Panel header="" style={{ width: '80%', marginTop: '20px', margin: '0 auto' }}>
      <BookingDataTable />
    </Panel>
  );
};

export default MyBookingPage;

