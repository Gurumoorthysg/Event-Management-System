package com.cognizant.entity;

import java.time.LocalDate;

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
@Table(name = "event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eventId;
	private String name;
	private String category;
	private String location;
	private LocalDate date;
	
	@ManyToOne
    @JoinColumn(name = "organizerId", nullable = false)
    private User organizerId;
	private int ticketAvailability;
	
	public Event(String name, String category, String location, LocalDate date, User organizerId, int ticketAvailability) {
		super();
		this.name = name;
		this.category = category;
		this.location = location;
		this.date = date;
		this.organizerId = organizerId;
		this.ticketAvailability = ticketAvailability;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public User getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(User organizerId) {
		this.organizerId = organizerId;
	}

	public int getTicketAvailability() {
		return ticketAvailability;
	}

	public void setTicketAvailability(int ticketAvailability) {
		this.ticketAvailability = ticketAvailability;
	}
	

	
	
}


