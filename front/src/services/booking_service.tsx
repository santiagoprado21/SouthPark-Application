import axios from 'axios';
import { Booking } from '../models/Booking';

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

    delete(id: string) {
        return axios.delete(this.baseUrl + `my_bookings/delete/${id}`).then(res => res.data);
    }

    update(id: string, booking: Booking) {
        const config = {
          headers: {
            'Content-Type': 'application/json'
          }
        };
        return axios.put(this.baseUrl + `update/${id}`, JSON.stringify(booking), config).then(res => res.data);
    }
}
