package com.cognizant.Dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;


public class FeedbackDto {

	@Positive(message = "Event ID must be positive number")
	private long eventId;

	@Positive(message = "User ID must be positive number")
	private long userId;

	@Min(value = 1, message = "Rating must be at least 1")
	@Max(value = 5, message = "Rating must not exceed 5")
	private int rating;

	@NotBlank(message = "Comment must not be blank")
	@Size(min = 10, message = "Comment must be greater then 10 characters")
	private String comment;

	public FeedbackDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackDto(@Positive(message = "Event ID must be positive number") long eventId,
			@Positive(message = "User ID must be positive number") long userId,
			@Min(value = 1, message = "Rating must be at least 1") @Max(value = 5, message = "Rating must not exceed 5") int rating,
			@NotBlank(message = "Comment must not be blank") @Size(min = 10, message = "Comment must be greater then 10 characters") String comment) {
		super();
		this.eventId = eventId;
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
