package com.cognizant.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class UserDisplayDto {

	
	private Long userId;
	@NotBlank(message="Name is mandatory")
    private String name;
	@Email(message="Invalid email format")
	@NotBlank(message="Email is mandatory")
    private String email;
	@Pattern(regexp ="\\d{10}", message ="Contact number should be 10 digits")
    private String contactNumber;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public UserDisplayDto(Long userId, @NotBlank(message = "Name is mandatory") String name,
			@Email(message = "Invalid email format") @NotBlank(message = "Email is mandatory") String email,
			@Pattern(regexp = "\\d{10}", message = "Contact number should be 10 digits") String contactNumber) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	public UserDisplayDto() {
		super();
		// TODO Auto-generated constructor stub
	}
}
