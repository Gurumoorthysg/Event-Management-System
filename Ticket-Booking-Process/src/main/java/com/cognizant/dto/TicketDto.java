package com.cognizant.dto;

//import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class TicketDto {

	
//	private Long bookingId;
	
	private Long eventId;
	
	public TicketDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketDto(Long eventId, Long userId, int noOfTickets) {
	super();
	this.eventId = eventId;
	this.userId = userId;
	this.noOfTickets = noOfTickets;
}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	private Long userId;
	
	private int noOfTickets;
	
//	private LocalDate bookingDate;


}
