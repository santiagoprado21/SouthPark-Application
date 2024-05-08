import React, { useEffect, useState } from "react";
import { booking_service } from "@/services/booking_service";
import { DataTable } from "primereact/datatable";
import { Column } from "primereact/column";
import DateColumn from "@/components/DateColumn/DateColumn";

const BookingDataTable = () => {
  const [bookings, setBookings] = useState([]);
  const bookingService = new booking_service();

  useEffect(() => {
    bookingService.getAll().then((bookingData) => {
      setBookings(bookingData);
    });
  }, []);

  return (
    <div>
      <DataTable value={bookings}>
        <Column field="idBooking" header="ID Booking" />
        <Column field="idClient" header="ID Client" />
        <Column field="idActivity" header="ID Activity" />
        <Column field="bookingDate" header="Booking Date" body={DateColumn} />
        <Column field="duration" header="Duration" />
        <Column field="hour" header="Hour" />
        <Column field="status" header="Status" />
        <Column field="description" header="Description" />
      </DataTable>
    </div>
  );
};

export default BookingDataTable;