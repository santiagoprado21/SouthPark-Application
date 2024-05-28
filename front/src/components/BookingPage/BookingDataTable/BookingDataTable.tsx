import React, { useEffect, useState, useRef } from "react";
import { booking_service } from "@/services/booking_service";
import { DataTable } from "primereact/datatable";
import { Column } from "primereact/column";
import { InputText } from "primereact/inputtext";
import { Dialog } from "primereact/dialog";
import { Button } from "primereact/button";
import { Toast } from "primereact/toast";
import { Booking } from '../../../models/Booking';
import DateColumn from "@/components/BookingPage/BookingDataTable/DateColumn/DateColumn";
import HourColumn from "@/components/BookingPage/BookingDataTable/HourColumn/HourColumn";
import { StatusColumn } from "@/components/BookingPage/StatusColumn/StatusColumn";
import { Toolbar } from 'primereact/toolbar';

const BookingDataTable = () => {
  const [bookings, setBookings] = useState<Booking[]>([]);
  const [filteredBookings, setFilteredBookings] = useState<Booking[]>([]);
  const [selectedBooking, setSelectedBooking] = useState<Booking | null>(null);
  const [isDialogVisible, setIsDialogVisible] = useState(false);
  const [globalFilter, setGlobalFilter] = useState("");
  const toast = useRef<Toast>(null);

  const statusOptions = [
    { label: 'Confirmado', value: 'Confirmado' },
    { label: 'Pendiente', value: 'Pendiente' },
    { label: 'Cancelado', value: 'Cancelado' }
  ];

  useEffect(() => {
    const bookingService = new booking_service();
    bookingService.getAll().then(data => {
      setBookings(data);
      setFilteredBookings(data);
    });
  }, []);

  const handleCancel = (booking: Booking) => {
    const bookingService = new booking_service();
    bookingService.delete(booking.idBooking).then(() => {
      setBookings(bookings.filter(b => b.idBooking !== booking.idBooking));
      setFilteredBookings(filteredBookings.filter(b => b.idBooking !== booking.idBooking));
      if (toast.current) {
        toast.current.show({ severity: 'success', summary: 'Éxito', detail: 'Reserva cancelada' });
      }
    }).catch(() => {
      if (toast.current) {
        toast.current.show({ severity: 'error', summary: 'Error', detail: 'No se pudo cancelar la reserva' });
      }
    });
  };

  const handleModify = (booking: Booking) => {
    setSelectedBooking(booking);
    setIsDialogVisible(true);
  };

  const saveChanges = () => {
    if (selectedBooking) {
      const bookingService = new booking_service();
      bookingService.update(selectedBooking.idBooking, selectedBooking).then(updatedBooking => {
        const updatedBookings = bookings.map(b => (b.idBooking === updatedBooking.idBooking ? updatedBooking : b));
        setBookings(updatedBookings);
        setFilteredBookings(updatedBookings);
        setIsDialogVisible(false);
        if (toast.current) {
          toast.current.show({ severity: 'success', summary: 'Éxito', detail: 'Reserva modificada' });
        }
      }).catch(() => {
        if (toast.current) {
          toast.current.show({ severity: 'error', summary: 'Error', detail: 'No se pudo modificar la reserva' });
        }
      });
    }
  };

  const onGlobalFilterChange = (e: { target: { value: any; }; }) => {
    const value = e.target.value;
    setGlobalFilter(value);

    const filtered = bookings.filter(booking => {
      return Object.values(booking).some(field => field.toString().toLowerCase().includes(value.toLowerCase()));
    });

    setFilteredBookings(filtered);
  };

  const actionBodyTemplate = (rowData: Booking) => {
    return (
      <div>
        <Button label="Modificar" icon="pi pi-pencil" onClick={() => handleModify(rowData)} />
        <Button label="Cancelar" icon="pi pi-times" className="p-button-danger" onClick={() => handleCancel(rowData)} />
      </div>
    );
  };

  const leftToolbarTemplate = () => {
    return (
      <div className="p-inputgroup">
        <span className="p-inputgroup-addon">
          <i className="pi pi-search"></i>
        </span>
        <InputText 
          type="search" 
          value={globalFilter} 
          onChange={onGlobalFilterChange} 
          placeholder="Buscar reservas" 
          style={{ width: '300px' }} 
        />
      </div>
    );
  };

  return (
    <div>
      <Toolbar left={leftToolbarTemplate} style={{ marginBottom: '20px' }} />
      <DataTable value={filteredBookings}>
        <Column field="idActivity" header="Activity" />
        <Column field="bookingDate" header="Date" body={DateColumn} />
        <Column field="duration" header="Duration" />
        <Column field="hour" header="Hour" body={HourColumn}/>
        <Column
          field="status"
          header="Status"
          body={(rowData) =>
            rowData.status.toLowerCase() === "confirmado" ? (
              <span style={{ color: "green" }}>{rowData.status}</span>
            ) : (
              <span>{rowData.status}</span>
            )
          }
        />
        <Column field="description" header="Description" />
        <Column body={actionBodyTemplate} header="Acciones" />
      </DataTable>

      <Dialog header="Modificar Reserva" visible={isDialogVisible} onHide={() => setIsDialogVisible(false)}>
        <div className="p-fluid">
          <div className="p-field">
            <label htmlFor="status">Status</label>
            <select 
              id="status" 
              value={selectedBooking ? selectedBooking.status : ''} 
              onChange={(e) => setSelectedBooking(selectedBooking ? { ...selectedBooking, status: e.target.value } : null)} 
            >
              <option value="">Seleccionar Estado</option>
              {statusOptions.map((option) => (
                <option key={option.value} value={option.value}>{option.label}</option>
              ))}
            </select>
          </div>
          <div className="p-field">
            <label htmlFor="description">Descripción</label>
            <InputText 
              id="description" 
              type="text" 
              value={selectedBooking?.description || ''} 
              onChange={(e) => setSelectedBooking(selectedBooking ? { ...selectedBooking, description: e.target.value } : null)} 
            />
          </div>
          <Button label="Guardar" icon="pi pi-check" onClick={saveChanges} />
        </div>
      </Dialog>

      <Toast ref={toast} />
    </div>
  );
};

export default BookingDataTable;
