// src/services/booking_service.ts
import axios from 'axios';
import { Booking } from '../models/Booking'; // Importa la interfaz Booking

export class booking_service {

    baseUrl = 'http://localhost:9093/booking/';

    getAll() {
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }

    save(booking: Booking) {
        const config = {
          headers: {
            'Content-Type': 'application/json'
          }
        };
        return axios.post(this.baseUrl + "addBooking", JSON.stringify(booking), config).then(res => res.data);
      }
      
}
