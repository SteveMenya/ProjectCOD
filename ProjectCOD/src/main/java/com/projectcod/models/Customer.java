package com.projectcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Id;
		@Column(length=50, nullable=false)
		private String email;
		@Column(length=50, nullable=false, name= "first_name")
		private String firstName;
		@Column(length=50, nullable=false, name= "last_name" )
		private String lastName;
		@Column(length=50, nullable=false, name= "phone_number")
		private String phoneNumber;
		@Column(length=50, nullable=false)
		private String password;
		
		
		
		public Customer() {
			super();
		}



		public Customer(int id, String email, String firstName, String lastName, String phoneNumber, String password) {
			super();
			Id = id;
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.password = password;
		}



		public int getId() {
			return Id;
		}



		public void setId(int id) {
			Id = id;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
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



		public String getPhoneNumber() {
			return phoneNumber;
		}



		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		@Override
		public String toString() {
			return "Customer [Id=" + Id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", phoneNumber=" + phoneNumber + ", password=" + password + "]";
		}
		
}
		

		
