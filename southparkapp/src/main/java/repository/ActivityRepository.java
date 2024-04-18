package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.southpark.domain.Activity;

public interface ActivityRepository extends JpaRepository<Activity, String>{

}
