package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class Booking {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private Long ticketNo;
private String fullName;
private String from;
private String destination;
@CreationTimestamp
private Date date;
private String time;
public Long getTicketNo() {
	return ticketNo;
}
public void setTicketNo(Long ticketNo) {
	this.ticketNo = ticketNo;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
}
