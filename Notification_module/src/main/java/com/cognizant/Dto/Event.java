package com.cognizant.Dto;
 
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


public class Event {

	    private Long eventId;
 
	    private String name;
	    private String category;
	    private String location;
	    private LocalDate date;
	    private User user;
	    public Event() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Event(Long eventId, String name, String category, String location, LocalDate date, User user,
				int ticketAvailability) {
			super();
			this.eventId = eventId;
			this.name = name;
			this.category = category;
			this.location = location;
			this.date = date;
			this.user = user;
			this.ticketAvailability = ticketAvailability;
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
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public int getTicketAvailability() {
			return ticketAvailability;
		}
		public void setTicketAvailability(int ticketAvailability) {
			this.ticketAvailability = ticketAvailability;
		}
		private int ticketAvailability;
 
}