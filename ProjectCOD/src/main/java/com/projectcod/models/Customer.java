package com.projectcod.models;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
@Table(name ="customers")
public class Customer {
	@Id
	private int customerId;
	@Column(length=50, nullable=false, name="firstname")
	private String firstName;
	@Column(length=50, nullable=false, name="lastname")
	private String lastName;
	@Column(length=50, nullable=false, name="email")
	private String email;
	@Column(length=50, nullable=false, name="phonenumber")
	private String phoneNumber;
	@Column(length=50, nullable=false, name="password")
	private String password;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "customerid", nullable = false)
	 @OnDelete(action = OnDeleteAction.CASCADE)
	 private Order order;
	
	//default constructor
	public Customer() {
		super();
	}
	

	public Customer(int customerId, String firstName, String lastName, String email, String phoneNumber,
			String password) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}



	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", password=" + password + "]";
	}
	
	
	
	
	
}
