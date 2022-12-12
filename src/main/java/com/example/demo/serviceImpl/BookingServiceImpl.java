package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookingRepository;
import com.example.demo.dto.Bookingdto;
import com.example.demo.model.Booking;
import com.example.demo.services.BookingServices;
@Service
public class BookingServiceImpl implements BookingServices {
	@Autowired
	BookingRepository bookingRepository;

	@Override
	public ResponseEntity<String> save(Bookingdto bookingdto) {
	Booking book=new Booking();

	book.setFullName(bookingdto.getFullName());
	book.setFrom(bookingdto.getFrom());
	book.setDestination(bookingdto.getDestination());
//	Optional<Booking> date=bookingRepository.
	book.setDate(new Date());
	book.setTime(bookingdto.getTime());
	bookingRepository.save(book);
	return new ResponseEntity<>("200 Ticket Booking Sucessfully",HttpStatus.OK);
	}

	@Override
	public Optional<Booking> findById(Long ticketNo) {
	Optional<Booking> list=bookingRepository.findById(ticketNo);
		return list;
	}

	@Override
	public ResponseEntity<String> deleteByid(Long ticketNo) {

		bookingRepository.deleteById(ticketNo);
		return new ResponseEntity<>("Delete Sucessfully....",HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> update(Long ticketNo, Bookingdto bookingdto) {
		Optional<Booking> id=bookingRepository.findById(ticketNo);
		if(id.isPresent()) {
			
			id.get().setFullName(bookingdto.getFullName());
			id.get().setFrom(bookingdto.getFrom());
			id.get().setDestination(bookingdto.getDestination());
			id.get().setDate(new Date());
			id.get().setTime(bookingdto.getTime());
			bookingRepository.save(id.get());
		return new ResponseEntity<>("Ticket Details Update Sucessfully...",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Ticket Number is Invalid",HttpStatus.OK);
		}
	}

	}


