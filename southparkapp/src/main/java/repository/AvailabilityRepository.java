package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.southpark.domain.Availability;

public interface AvailabilityRepository extends JpaRepository<Availability, String>{

}
