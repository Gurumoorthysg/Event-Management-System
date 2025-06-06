package com.cognizant.dto;

import java.time.LocalDate;

import com.cognizant.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class EventDto {

	
	private Long eventId;
	private String name;
	private String category;
	private String location;
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
	public EventDto(Long eventId, String name, String category, String location, LocalDate date, User organizerId,
			int ticketAvailability) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.category = category;
		this.location = location;
		this.date = date;
		this.organizerId = organizerId;
		this.ticketAvailability = ticketAvailability;
	}
	public EventDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	private LocalDate date;
	private User  organizerId;
	private int ticketAvailability;
}
