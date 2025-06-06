package com.cognizant.Dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Ticket{

	private Long bookingId;

	private Event event;

	private User user;
	
	public Ticket(Long bookingId, Event event, User user, int noOfTickets, LocalDate bookingDate, String status) {
		super();
		this.bookingId = bookingId;
		this.event = event;
		this.user = user;
		this.noOfTickets = noOfTickets;
		this.bookingDate = bookingDate;
		this.status = status;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	private int noOfTickets;
	private LocalDate bookingDate;
	private String status;

}
