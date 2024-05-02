import axios from 'axios';

export class booking_service{

    baseUrl = 'http://localhost:9093/booking/';

    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }

}