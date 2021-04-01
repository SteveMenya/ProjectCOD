package com.projectcod.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
		@Id
		private int orderId;
		private String customerEmail;
		private String itemName;
		private int quantity;
		private int total;
		
		@OneToMany(targetEntity = Customer.class,fetch= FetchType.EAGER)
		private List<Order> cOrder;
		
		

		public Order(int orderId, String customerEmail, String itemName, int quantity, int total, List<Order> cOrder) {
			super();
			this.orderId = orderId;
			this.customerEmail = customerEmail;
			this.itemName = itemName;
			this.quantity = quantity;
			this.total = total;
			this.cOrder = cOrder;
		}

		public Order() {
			super();
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
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

		public List<Order> getcOrder() {
			return cOrder;
		}

		public void setcOrder(List<Order> cOrder) {
			this.cOrder = cOrder;
		}

		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", customerEmail=" + customerEmail + ", itemName=" + itemName
					+ ", quantity=" + quantity + ", total=" + total + ", cOrder=" + cOrder + "]";
		}
		
		
		
}
