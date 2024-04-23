package com.southpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.southpark.domain.Booking;

public interface BookingRepository extends JpaRepository<Booking, String>{

}
