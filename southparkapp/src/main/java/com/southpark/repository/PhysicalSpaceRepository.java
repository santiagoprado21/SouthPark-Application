package com.southpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.southpark.domain.PhysicalSpace;

public interface PhysicalSpaceRepository extends JpaRepository<PhysicalSpace, String>{

}
