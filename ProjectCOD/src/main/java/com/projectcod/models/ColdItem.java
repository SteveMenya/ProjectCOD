package com.projectcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cold_items")
public class ColdItem {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int itemId;
		@Column(length=500, nullable=false, name="item_name")
		private String itemName;
		@Column(length=500, nullable=false, name="item_cost")
		private String itemCost;
		@Column(length=500, nullable=false, name="description")
		private String description;
		@Column(length=500, nullable=false, name="item_url")
		private String itemUrl;
		
		public ColdItem() {
			super();
		}

		public ColdItem(String itemName, String itemCost, String description, String itemUrl) {
			super();
			this.itemName = itemName;
			this.itemCost = itemCost;
			this.description = description;
			this.itemUrl = itemUrl;
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

		public String getItemUrl() {
			return itemUrl;
		}

		public void setItemUrl(String itemUrl) {
			this.itemUrl = itemUrl;
		}
		
		
}


