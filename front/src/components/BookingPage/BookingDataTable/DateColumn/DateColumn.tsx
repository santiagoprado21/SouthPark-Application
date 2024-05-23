import { format } from "date-fns";
import React from "react";

type dateRowDate = {
  bookingDate: string;
};

export default function DateColumn(rowData: dateRowDate) {
  function formatDate(date: string) {
    return format(new Date(date), "MM/dd/yyyy");
  }
  return <span>{formatDate(rowData.bookingDate)}</span>;
}