package com.projectcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name ="items")
public class Item {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int itemId;
		@Column(length=500, nullable=false, name="name")
		private String itemName;
		@Column(length=500, nullable=false, name="cost")
		private String itemCost;
		@Column(length=500, nullable=false)
		private String description;
		@Column(length=500, nullable=false ,name= "url")
		private String itemUrl;
		@Column(length=500, nullable= false, name= "type")
		private String type;
		
		@ManyToOne
		@JoinColumn(name = "orders")
		private Order order;
		 
		public Item() {
			super();
		}

		public Item(int itemId, String itemName, String itemCost, String description, String itemUrl, String type,
				Order order) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.itemCost = itemCost;
			this.description = description;
			this.itemUrl = itemUrl;
			this.type = type;
			this.order = order;
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

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		@Override
		public String toString() {
			return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + ", description="
					+ description + ", itemUrl=" + itemUrl + ", type=" + type + ", order=" + order + "]";
		}
		

}