package com.cognizant.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;


public class TicketOutputDto {

	private Long bookingId;

	private Long eventId;

	private String eventName;

	private LocalDate eventDate;

	public TicketOutputDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketOutputDto(Long bookingId, Long eventId, String eventName, LocalDate eventDate, String location,
			String userName, String email, int noOfTickets, LocalDate bookingDate, String status) {
		super();
		this.bookingId = bookingId;
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.location = location;
		this.userName = userName;
		this.email = email;
		this.noOfTickets = noOfTickets;
		this.bookingDate = bookingDate;
		this.status = status;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String location;

	private String userName;
	
	private String email;

	private int noOfTickets;

	private LocalDate bookingDate;

	private String status;

}
