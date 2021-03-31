package com.projectcod.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	private int orderid;
	private int customerid;
	private int employeeid;
	private int itemid;
	private int billnumber;
	private int quantity;
	
	//default constructor
	public Order() {
		super();
	}
	//constructor using fields
	public Order(int orderid, int customerid, int employeeid, int itemid, int billnumber, int quantity) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.employeeid = employeeid;
		this.itemid = itemid;
		this.billnumber = billnumber;
		this.quantity = quantity;
	}
	
	
	public int getOrderid() {
		return orderid;
	}
	
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getBillnumber() {
		return billnumber;
	}

	public void setBillnumber(int billnumber) {
		this.billnumber = billnumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customerid=" + customerid + ", itemid=" + itemid + ", billnumber="
				+ billnumber + ", quantity=" + quantity + "]";
	}

	
	
	
}
