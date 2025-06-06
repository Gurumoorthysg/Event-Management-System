package com.cognizant.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class EventRequestDto {


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
	public Long getOrganizerId() {
		return organizerId;
	}
	public void setOrganizerId(Long organizerId) {
		this.organizerId = organizerId;
	}
	public EventRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventRequestDto(String name, String category, String location, LocalDate date, Long organizerId,
			int ticketAvailability) {
		super();
		this.name = name;
		this.category = category;
		this.location = location;
		this.date = date;
		this.organizerId = organizerId;
		this.ticketAvailability = ticketAvailability;
	}
	public int getTicketAvailability() {
		return ticketAvailability;
	}
	public void setTicketAvailability(int ticketAvailability) {
		this.ticketAvailability = ticketAvailability;
	}
	private String name;
	private String category;
	private String location;
	private LocalDate date;
	private Long organizerId; // just pass organizer's userID
	private int ticketAvailability;
}
