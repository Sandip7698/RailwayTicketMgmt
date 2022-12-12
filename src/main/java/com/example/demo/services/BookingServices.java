package com.example.demo.services;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.Bookingdto;
import com.example.demo.model.Booking;

public interface BookingServices {

	ResponseEntity<String> save(Bookingdto bookingdto);

	Optional<Booking> findById(Long ticketNo);

	ResponseEntity<String> deleteByid(Long ticketNo);

	ResponseEntity<String> update(Long ticketNo, Bookingdto bookingdto);




}
