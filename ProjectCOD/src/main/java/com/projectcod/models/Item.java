package com.projectcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name ="items")
public class Item {
		@Id
		@Column(length=500, nullable=false, name="item_name", unique= true)
		private String itemName;
		@Column(length=500, nullable=false, name="item_cost")
		private String itemCost;
		@Column(length=500, nullable=false, name="description")
		private String description;
		@Column(length=500, nullable=false, name="item_url")
		private String itemUrl;
		
		 @ManyToOne(fetch = FetchType.LAZY)
		    @JoinColumn(name = "order_id", nullable = false)
		 private Order order;
		
		 
		public Item() {
			super();
		}
		
		

		public Item(int itemId, String itemName, String itemCost, String description, String itemUrl, Order order) {
			super();
			this.itemName = itemName;
			this.itemCost = itemCost;
			this.description = description;
			this.itemUrl = itemUrl;
			this.order = order;
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



		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}



		@Override
		public String toString() {
			return "Item [itemName=" + itemName + ", itemCost=" + itemCost + ", description=" + description
					+ ", itemUrl=" + itemUrl + ", order=" + order + "]";
		}

		
}
