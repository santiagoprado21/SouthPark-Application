

export interface Booking {
    idBooking: string;
    idClient: string;
    idActivity: string;
    bookingDate: Date | null;
    duration: number;
    hour: Date | null;
    status: string;
    description: string;
  }
  