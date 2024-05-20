import React, { useState, forwardRef, useImperativeHandle } from 'react';
import { Dialog } from 'primereact/dialog';
import { InputText } from 'primereact/inputtext';
import { InputNumber, InputNumberChangeEvent } from 'primereact/inputnumber';
import { Calendar } from 'primereact/calendar';
import { Booking } from '../../models/Booking'; 
import { booking_service } from '../../services/booking_service';
import './BookingDialog.css'; 

interface BookingDialogProps {
  visible: boolean;
  onHide: () => void;
}

const BookingDialog = forwardRef<unknown, BookingDialogProps>(({ visible, onHide }, ref) => {
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
      console.log("Booking saved successfully");
      onHide();
      window.location.reload(); // Recarga la página
    }).catch((error) => {
      console.error("Error saving booking:", error);
    });
  };

  return (
    <Dialog header="Nueva Reserva" visible={visible} onHide={onHide} style={{ width: '50vw' }}>
      <div className="p-fluid booking-dialog">
        <br></br>
        <div className="p-field">
          <span className="p-float-label">
            <InputText id="idClient" value={booking.idClient} onChange={(e) => handleInputChange(e, 'idClient')} />
            <label htmlFor="idClient">ID Cliente</label>
          </span>
        </div>
        <div className="p-field">
          <span className="p-float-label">
            <InputText id="idActivity" value={booking.idActivity} onChange={(e) => handleInputChange(e, 'idActivity')} />
            <label htmlFor="idActivity">ID Actividad</label>
          </span>
        </div>
        <div className="p-field">
          <span className="p-float-label">
            <Calendar id="bookingDate" value={booking.bookingDate} onChange={(e) => handleDateChange(e.value as Date, 'bookingDate')} dateFormat="yy-mm-dd" />
            <label htmlFor="bookingDate">Fecha de Reserva</label>
          </span>
        </div>
        <br></br>
        <div className="p-field">
          <span className="p-float-label">
            <InputNumber id="duration" value={booking.duration} onChange={(e) => handleNumberChange(e, 'duration')} />
            <label htmlFor="duration">Duración</label>
          </span>
        </div>
        <div className="p-field">
          <span className="p-float-label">
            <Calendar id="hour" value={booking.hour} onChange={(e) => handleDateChange(e.value as Date, 'hour')} timeOnly hourFormat="24" showTime />
            <label htmlFor="hour">Hora</label>
          </span>
        </div>
        <div className="p-field">
          <span className="p-float-label">
            <InputText id="status" value={booking.status} onChange={(e) => handleInputChange(e, 'status')} />
            <label htmlFor="status">Estado</label>
          </span>
        </div>
        <div className="p-field">
          <span className="p-float-label">
            <InputText id="description" value={booking.description} onChange={(e) => handleInputChange(e, 'description')} />
            <label htmlFor="description">Descripción</label>
          </span>
        </div>
        <div className="p-field">
          <button onClick={saveBooking}>Guardar</button>
        </div>
      </div>
    </Dialog>
  );
});

export default BookingDialog;
