package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

	Optional<Booking> findByfullName(String fullName);

	Optional<Booking> findBydate(String date);

}
