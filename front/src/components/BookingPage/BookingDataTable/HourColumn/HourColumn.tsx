import React from 'react';
import { format } from 'date-fns';

type dateRowDate = {
  bookingDate: string;
  hour?: string; // Optional hour property (if your data structure allows)
};

export default function HourColumn(rowData: dateRowDate) {
  // Extract hour from bookingDate or hour property (flexible approach)
  const hour = rowData.hour ? rowData.hour : new Date(rowData.bookingDate).getHours();

  // Format hour using options
  const formattedHour = format(new Date(hour), 'h:mm a'); // 12-hour format with AM/PM (only hour)

  return <span>{formattedHour}</span>;
}
