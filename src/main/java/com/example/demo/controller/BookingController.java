package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Bookingdto;
import com.example.demo.model.Booking;
import com.example.demo.services.BookingServices;

@RestController
public class BookingController {
@Autowired
BookingServices bookingServices;

@PostMapping("/save")
public ResponseEntity<String> savedata(@RequestBody Bookingdto bookingdto){
	return bookingServices.save(bookingdto);
	
}

@GetMapping("/findByticket/{ticketNo}")
public Optional<Booking> findTicket(@PathVariable Long ticketNo){
	return bookingServices.findById(ticketNo);
}


@DeleteMapping("/deleteById/{ticketNo}")
public ResponseEntity<String> deletee(@PathVariable Long ticketNo){
	return bookingServices.deleteByid(ticketNo);
}

@PutMapping("/update/{ticketNo}")
public ResponseEntity<String> update(@PathVariable Long ticketNo,@RequestBody Bookingdto bookingdto){
	return bookingServices.update(ticketNo,bookingdto);

}
}
