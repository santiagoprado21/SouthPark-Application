// components/BookingDialog/index.tsx

import React, { useState, forwardRef, useImperativeHandle } from 'react';
import { Dialog } from 'primereact/dialog';
import { InputText } from 'primereact/inputtext';
import { InputNumber, InputNumberChangeEvent } from 'primereact/inputnumber';
import { Calendar } from 'primereact/calendar';
import { Booking } from '../../../models/Booking'; 
import { booking_service } from '../../../services/booking_service';
import './BookingDialog.css'; 

interface BookingDialogProps {
  visible: boolean;
  onHide: () => void;
  showToast: (severity: string, summary: string, detail: string) => void;
}

const BookingDialog = forwardRef<unknown, BookingDialogProps>(({ visible, onHide, showToast }, ref) => {
  const [booking, setBooking] = useState<Booking>({
    idBooking: '',
    idClient: '',
    idActivity: '',
    bookingDate: null,
    duration: 0,
    hour: null,
    status: '',
    description: '',
  });

  useImperativeHandle(ref, () => ({
    resetForm() {
      setBooking({
        idBooking: '',
        idClient: '',
        idActivity: '',
        bookingDate: null,
        duration: 0,
        hour: null,
        status: '',
        description: '',
      });
    }
  }));

  const bookingService = new booking_service();

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>, field: keyof Booking) => {
    setBooking({ ...booking, [field]: e.target.value });
  };

  const handleDateChange = (e: Date | null, field: 'bookingDate' | 'hour') => {
    setBooking({ ...booking, [field]: e });
  };

  const handleNumberChange = (e: InputNumberChangeEvent, field: 'duration') => {
    const value = e.value !== null ? e.value : 0;
    setBooking((prevBooking) => ({ ...prevBooking, [field]: value }));
  };

  const saveBooking = () => {
    bookingService.save(booking).then(() => {
      showToast('success', 'Reserva Guardada', 'La reserva se ha guardado exitosamente.');
      onHide();
      setTimeout(function() {
        window.location.reload();
      }, 2000);
    }).catch((error) => {
      showToast('error', 'Error', 'Hubo un problema al guardar la reserva.');
    });
  };

  return (
    <Dialog header="Nueva Reserva" visible={visible} onHide={onHide} className="booking-dialog">
      <div className="p-fluid p-4">
        <div className="p-field mb-4">
          <span className="p-float-label w-full">
            <InputText id="idClient" value={booking.idClient} onChange={(e) => handleInputChange(e, 'idClient')} className="input" />
            <label htmlFor="idClient" className="text-gray-600">ID Cliente</label>
          </span>
        </div>
        <div className="p-field mb-4">
          <span className="p-float-label w-full">
            <InputText id="idActivity" value={booking.idActivity} onChange={(e) => handleInputChange(e, 'idActivity')} className="input" />
            <label htmlFor="idActivity" className="text-gray-600">ID Actividad</label>
          </span>
        </div>
        <div className="p-field mb-4">
          <span className="p-float-label w-full">
            <Calendar id="bookingDate" value={booking.bookingDate} onChange={(e) => handleDateChange(e.value as Date, 'bookingDate')} dateFormat="yy-mm-dd" className="input" />
            <label htmlFor="bookingDate" className="text-gray-600">Fecha de Reserva</label>
          </span>
        </div>
        <div className="p-field mb-4">
          <span className="p-float-label w-full">
            <InputNumber id="duration" value={booking.duration} onChange={(e) => handleNumberChange(e, 'duration')} className="input" />
            <label htmlFor="duration" className="text-gray-600">Duración (horas)</label>
          </span>
        </div>
        <div className="p-field mb-4">
          <span className="p-float-label w-full">
            <Calendar id="hour" value={booking.hour} onChange={(e) => handleDateChange(e.value as Date, 'hour')} timeOnly hourFormat="24" showTime className="input" />
            <label htmlFor="hour" className="text-gray-600">Hora</label>
          </span>
        </div>
        <div className="p-field mb-4">
          <span className="p-float-label w-full">
            <InputText id="status" value={booking.status} onChange={(e) => handleInputChange(e, 'status')} className="input" />
            <label htmlFor="status" className="text-gray-600">Estado</label>
          </span>
        </div>
        <div className="p-field mb-4">
          <span className="p-float-label w-full">
            <InputText id="description" value={booking.description} onChange={(e) => handleInputChange(e, 'description')} className="input" />
            <label htmlFor="description" className="text-gray-600">Descripción</label>
          </span>
        </div>
        <div className="p-field">
          <button onClick={saveBooking} className="button">Guardar</button>
        </div>
      </div>
    </Dialog>
  );
});

export default BookingDialog;
