package com.cognizant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class User {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;

	    public User(Long userId, String name, String roles, String email, String password, String contactNumber) {
			super();
			this.userId = userId;
			this.name = name;
			this.roles = roles;
			this.email = email;
			this.password = password;
			this.contactNumber = contactNumber;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

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

		public String getRoles() {
			return roles;
		}

		public void setRoles(String roles) {
			this.roles = roles;
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

		private String name;
	    
	    private String roles="USER";

	    @Column(unique = true, nullable = false)
	    private String email;

	    private String password;

	    private String contactNumber;

		public User(String name, String email, String password, String contactNumber) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.contactNumber = contactNumber;
		}
	    
	    

}
