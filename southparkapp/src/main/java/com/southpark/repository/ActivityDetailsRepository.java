package com.southpark.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.southpark.domain.ActivityDetails;

public interface ActivityDetailsRepository extends JpaRepository<ActivityDetails, String>{

}
