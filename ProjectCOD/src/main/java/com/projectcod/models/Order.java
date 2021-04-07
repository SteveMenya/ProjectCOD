package com.projectcod.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "orders")
public class Order {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(length=50, nullable=false, name="order_id")
		private int orderId;
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "customer_email", nullable = false)
		private Customer customer;	
		@Column(length=50, nullable=false, name="quantity")
		private int quantity;
		@Column(length=50, nullable=false, name="total")
		private int total;
		

		 @OneToMany(cascade = CascadeType.ALL,
		            fetch = FetchType.LAZY,
		            mappedBy = "order")
		 
		 private List<Item> items;
		
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public Order(int orderId, Customer customer, int quantity, int total, List<Item> items) {
			super();
			this.orderId = orderId;
			this.customer = customer;
			this.quantity = quantity;
			this.total = total;
			this.items = items;
		}



		public int getOrderId() {
			return orderId;
		}


		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		


		public Customer getCustomer() {
			return customer;
		}



		public void setCustomer(Customer customer) {
			this.customer = customer;
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


		public List<Item> getItems() {
			return items;
		}


		public void setItems(List<Item> items) {
			this.items = items;
		}



		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", customer=" + customer + ", quantity=" + quantity + ", total="
					+ total + ", items=" + items + "]";
		}

		
			
		


		
}
