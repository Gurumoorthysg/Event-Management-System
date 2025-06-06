package com.cognizant.Entity;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Entity
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long notificationId;
	
	private long userId;
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notification(long notificationId, long userId, long eventId, String message, LocalDateTime sentTimeStamp,
			Maildetails maildetails) {
		super();
		this.notificationId = notificationId;
		this.userId = userId;
		this.eventId = eventId;
		this.message = message;
		this.sentTimeStamp = sentTimeStamp;
		this.maildetails = maildetails;
	}

	public long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(long notificationId) {
		this.notificationId = notificationId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getSentTimeStamp() {
		return sentTimeStamp;
	}

	public void setSentTimeStamp(LocalDateTime sentTimeStamp) {
		this.sentTimeStamp = sentTimeStamp;
	}

	public Maildetails getMaildetails() {
		return maildetails;
	}

	public void setMaildetails(Maildetails maildetails) {
		this.maildetails = maildetails;
	}

	private long eventId;
	private String message;
	private LocalDateTime sentTimeStamp;
	
	@OneToOne
	@JoinColumn(name="maildetails_id",referencedColumnName = "notifiId")
	private Maildetails maildetails;
	

}
