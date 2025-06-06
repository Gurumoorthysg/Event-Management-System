package com.cognizant.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
public class User {

	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;

	    private String name;
	    private String email;
	    private String password;
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
		public User(Long userId, String name, String email, String password, String contactNumber) {
			super();
			this.userId = userId;
			this.name = name;
			this.email = email;
			this.password = password;
			this.contactNumber = contactNumber;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

}
