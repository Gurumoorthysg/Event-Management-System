package com.cognizant.entity;

import java.time.LocalDate;
import java.time.ZoneId;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="ticket")
public class Ticket {

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ticket(Long bookingId, Event event, User user, int noOfTickets, LocalDate bookingDate, String status) {
		super();
		this.bookingId = bookingId;
		this.event = event;
		this.user = user;
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


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eventId")
	private Event event;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId")
	private User user;
	
	private int noOfTickets;
	private LocalDate bookingDate=LocalDate.now(ZoneId.of("Asia/Kolkata"));
	private String status="Success";
	
	
	public Ticket(Event event, User user,int noOfTickets) {
		this.event = event;
		this.user = user;
		this.noOfTickets=noOfTickets;
//		this.bookingDate = bookingDate;
	
	}
	
	
	
	
	
}
