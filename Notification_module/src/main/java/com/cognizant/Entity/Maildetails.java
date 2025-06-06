package com.cognizant.Entity;

import java.time.LocalDateTime;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Entity
public class Maildetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long notifiId;
	private String emailId;
	private String body;
	public Maildetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Maildetails(Long notifiId, String emailId, String body, LocalDateTime senttime) {
		super();
		this.notifiId = notifiId;
		this.emailId = emailId;
		this.body = body;
		this.senttime = senttime;
	}
	public Long getNotifiId() {
		return notifiId;
	}
	public void setNotifiId(Long notifiId) {
		this.notifiId = notifiId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public LocalDateTime getSenttime() {
		return senttime;
	}
	public void setSenttime(LocalDateTime senttime) {
		this.senttime = senttime;
	}
	private LocalDateTime senttime;


}
