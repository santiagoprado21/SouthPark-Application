"use client";

import 'primereact/resources/themes/saga-blue/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';
import BookingDataTable from '../BookingDataTable/BookingDataTable';
import { Panel } from 'primereact/panel';
import { Menubar } from 'primereact/menubar';
import React, { useState, useRef } from 'react';
import BookingDialog from '../NewBookingPage/BookingDialog';
import { Toast } from 'primereact/toast';
import { booking_service } from '../../../services/booking_service';
import { Booking } from '../../../models/Booking';

const MyBookingPage = () => {


  const [displayDialog, setDisplayDialog] = useState(false);
  const toast = useRef<Toast>(null);
  const bookingDialogRef = useRef<any>(null);

  const showDialog = () => {
    bookingDialogRef.current.resetForm();
    setDisplayDialog(true);
  };

  const hideDialog = () => {
    setDisplayDialog(false);
  };

  const showToast = (severity: any, summary: string, detail: string) => {
    toast.current?.show({ severity, summary, detail });
  };

  return (
    <Panel header="" style={{ width: '80%', marginTop: '20px', margin: '0 auto' }}>
      <br></br>
      <BookingDataTable/>
      <BookingDialog ref={bookingDialogRef} visible={displayDialog} onHide={hideDialog} showToast={showToast} />
      <Toast ref={toast} />
      {/* Otros componentes o lógica de la página */}
    </Panel>
  );
};

export default MyBookingPage;
