package com.projectcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	@Id
	private int itemId;
	@Column(length=25, nullable=false, name="itemname")
	private String itemName;
	@Column(length=25, nullable=false, name="itemcost")
	private int itemCost;
	@Column(length=25, nullable=false, name="description")
	private String description;
	@Column(length=10, nullable=false, name="size")
	private String size;
	
	//default constructor
	public Item() {
		super();
	}
	
	//constructor using fields 
	public Item(int itemId, String itemName, int itemCost, String description, String size) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.description = description;
		this.size = size;
	}


	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemCost() {
		return itemCost;
	}

	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + ", description="
				+ description + ", size=" + size + "]";
	}
	
	
}
