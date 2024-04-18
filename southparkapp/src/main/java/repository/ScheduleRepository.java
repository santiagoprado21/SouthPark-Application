package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.southpark.domain.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, String>{

}
