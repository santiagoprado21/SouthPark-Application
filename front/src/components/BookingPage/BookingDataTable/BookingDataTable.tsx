import React, { useEffect, useState } from "react";
import { booking_service } from "@/services/booking_service";
import { DataTable } from "primereact/datatable";
import { Column } from "primereact/column";
import DateColumn from "@/components/BookingPage/BookingDataTable/DateColumn/DateColumn";
import HourColumn from "@/components/BookingPage/BookingDataTable/HourColumn/HourColumn";
import { StatusColumn } from "@/components/BookingPage/StatusColumn/StatusColumn";
import { Booking } from '../../../models/Booking';


const BookingDataTable = () => {
  const [bookings, setBookings] = useState<Booking[]>([]);

  useEffect(() => {
    const bookingService = new booking_service();
    bookingService.getAll().then(data => setBookings(data));
  }, []);

  return (
    <div>
       <DataTable value={bookings}>
        <Column field="idActivity" header="Activity" />
        <Column field="bookingDate" header="Date" body={DateColumn} />
        <Column field="duration" header="Duration" />
        <Column field="hour" header="Hour" body={HourColumn}/>
        {/*Temporal esta conlumna, separar en componentes*/}
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
      </DataTable>
    </div>
  );
};

export default BookingDataTable;