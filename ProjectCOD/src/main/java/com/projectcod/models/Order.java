package com.projectcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name= "id", length=50, nullable=false)
		private int orderId;
		@Column(length=50, nullable=false)
		private int quantity;
		@Column(length=50, nullable=false)
		private int total;
		
		
		@ManyToOne
		@JoinColumn(name = "customer")
		private Customer customer;
		
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Order(int orderId, int quantity, int total, Customer customer) {
			super();
			this.orderId = orderId;
			this.quantity = quantity;
			this.total = total;
			this.customer = customer;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", quantity=" + quantity + ", total=" + total + ", customer="
					+ customer + "]";
		}
		

		

		
			
		


		
}
