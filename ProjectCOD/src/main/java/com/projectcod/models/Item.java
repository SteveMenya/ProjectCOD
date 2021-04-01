package com.projectcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="items")
public class Item {
		@Id
		@Column(length=50, nullable=false, name="item_name")
		private String itemName;
		@Column(length=50, nullable=false, name="item_cost")
		private String itemCost;
		@Column(length=50, nullable=false, name="description")
		private String description;
		
		public Item() {
			super();
		}

		public Item(String itemName, String itemCost, String description) {
			super();
			this.itemName = itemName;
			this.itemCost = itemCost;
			this.description = description;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getItemCost() {
			return itemCost;
		}

		public void setItemCost(String itemCost) {
			this.itemCost = itemCost;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Item [itemName=" + itemName + ", itemCost=" + itemCost + ", description=" + description + "]";
		}
		
		
		
}
