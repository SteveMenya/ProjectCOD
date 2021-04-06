package com.projectcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customer_feedback")
public class CustomerFeedBack {
		@Column(length=50, nullable=false, name="first_name")
		private String firstName;
		@Column(length=50, nullable=false, name="last_name")
		private String lastName;
		@Id
		@Column(length=100, nullable=false, name="email")
		private String email;
		@Column(length=500, nullable=false, name="message")
		private String message;
		
		
		public CustomerFeedBack() {
			super();
		}


		public CustomerFeedBack(String firstName, String lastName, String email, String message) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.message = message;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getMessage() {
			return message;
		}


		public void setMessage(String message) {
			this.message = message;
		}


		@Override
		public String toString() {
			return "CustomerFeedBack [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", message=" + message + "]";
		}
		
		
}
