"use client";

import 'primereact/resources/themes/saga-blue/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';
import { Panel } from 'primereact/panel';
import React, { useState, useRef } from 'react';
import BookingDialog from './NewBookingPage/BookingDialog';
import { Toast } from 'primereact/toast';
import { Button } from 'primereact/button';
import './BookingPage.css';

const BookingPage = () => {
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
    <Panel header="" style={{ width: '80%', marginTop: '180px', margin: '0 auto' }}>
    <div className="button-container">
      <Button
        label="Realizar Reserva"
        icon="pi pi-calendar-plus"
        className="p-button-rounded p-button-text custom-button"
        onClick={showDialog}
      />
      <Button
        label="Mis Reservas"
        icon="pi pi-th-large"
        className="p-button-rounded p-button-text custom-button"
        onClick={() => window.location.href = "http://localhost:3000/booking/my_bookings"}
      />
    </div>
    <BookingDialog ref={bookingDialogRef} visible={displayDialog} onHide={hideDialog} showToast={showToast} />
    <Toast ref={toast} />
  </Panel>
  );
};

export default BookingPage;