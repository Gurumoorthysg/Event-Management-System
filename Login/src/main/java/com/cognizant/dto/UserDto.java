package com.cognizant.dto;





import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserDto {
	
	//private Long userId;
	
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@NotBlank(message="Name is mandatory")
    private String name;
	@Email(message="Invalid email format")
	@NotBlank(message="Email is mandatory")
    private String email;
	@Size(min =6, message="Password must be at least 6 characters")
    private String password;
	@Pattern(regexp ="\\d{10}", message ="Contact number should be 10 digits")
    private String contactNumber;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public UserDto(@NotBlank(message = "Name is mandatory") String name,
			@Email(message = "Invalid email format") @NotBlank(message = "Email is mandatory") String email,
			@Size(min = 6, message = "Password must be at least 6 characters") String password,
			@Pattern(regexp = "\\d{10}", message = "Contact number should be 10 digits") String contactNumber) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
	}
	
}
