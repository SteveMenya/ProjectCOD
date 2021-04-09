package com.projectcod.mainapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projectcod.models.Customer;

public class MainApp {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectCOD");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
//		em.persist();
//		em.persist(customer);
//		em.persist(item);
//		em.persist(itemTwo);
//			
//		em.persist();
		 Customer customer = em.find(Customer.class, 1);
		 System.out.println("customer: " + customer);
			
		//Order order = em.find(Order.class, 1); System.out.println(order);
			 
		// Item item = em.find(Item.class, 1); System.out.println("item: " + item);
			 
		 
	
			 
		 
		
			/*
			 * List<Item> itemsListThree = new ArrayList<>(); Order orderThree = new
			 * Order(2, 10, itemsListThree); Customer customer = new
			 * Customer("test@mail.com", "test", "test", "555-555-555", "password",
			 * orderThree); Item item3 = new Item("anotherSmoothie", "5",
			 * "another Healthy Choice", "smoothie.jpg", customer);
			 * itemsListThree.add(item3); em.persist(customer); em.persist(item3);
			 * em.persist(orderThree);
			 */
		 
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
		
	}

}
