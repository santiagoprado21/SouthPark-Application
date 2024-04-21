package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.southpark.domain.CancelationBooking;

public interface CancelationBookingRepository extends JpaRepository<CancelationBooking, String>{

}
