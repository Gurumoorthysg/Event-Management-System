package com.cognizant.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity

public class Event {
	 
		public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public User getOrganizer() {
		return organizer;
	}

	public void setOrganizer(User organizer) {
		this.organizer = organizer;
	}

	public Long getTicketAvailability() {
		return ticketAvailability;
	}

	public void setTicketAvailability(Long ticketAvailability) {
		this.ticketAvailability = ticketAvailability;
	}

		public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Event(Long eventId, String name, String category, String location, LocalDate date, User organizer,
			Long ticketAvailability) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.category = category;
		this.location = location;
		this.date = date;
		this.organizer = organizer;
		this.ticketAvailability = ticketAvailability;
	}

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long eventId;

	    private String name;
	    private String category;
	    private String location;
	    private LocalDate date;

	    @ManyToOne
	    @JoinColumn(name = "organizer_id")
	    private User organizer;
	    
	    private Long ticketAvailability;

}
