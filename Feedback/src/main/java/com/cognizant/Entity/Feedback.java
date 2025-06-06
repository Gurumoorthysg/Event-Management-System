package com.cognizant.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Entity
public class Feedback {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long feedbackId;

	    @ManyToOne
	    @JoinColumn(name = "event_id")
	    @JsonBackReference
	    private Event event;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    @JsonBackReference
	    private User user;

	    public Long getFeedbackId() {
			return feedbackId;
		}
		public void setFeedbackId(Long feedbackId) {
			this.feedbackId = feedbackId;
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
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		public String getSubmittedTimestamp() {
			return submittedTimestamp;
		}
		public void setSubmittedTimestamp(String submittedTimestamp) {
			this.submittedTimestamp = submittedTimestamp;
		}
		public Feedback() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Feedback(Long feedbackId, Event event, User user, int rating, String comments,
				String submittedTimestamp) {
			super();
			this.feedbackId = feedbackId;
			this.event = event;
			this.user = user;
			this.rating = rating;
			this.comments = comments;
			this.submittedTimestamp = submittedTimestamp;
		}
		private int rating;
	    private String comments;
	    private String submittedTimestamp;
}
