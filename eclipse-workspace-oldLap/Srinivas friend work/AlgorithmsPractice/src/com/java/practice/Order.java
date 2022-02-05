package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Order implements Comparable<Order> {
	private int id;
	private String name;
	private int amount;

	public Order(int id, String name, int amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public static class OrderByAmount implements Comparator<Order> {

		@Override
		public int compare(Order o1, Order o2) {
			return o1.amount > o2.amount ? 1 : (o1.amount < o2.amount) ? -1 : 0;
		}

	}

	public static class OrderByName implements Comparator<Order> {

		@Override
		public int compare(Order o1, Order o2) {

			return o1.name.compareTo(o2.name);
		}

	}

	@Override
	public int compareTo(Order o) {
		return this.id - o.id;
	}

	public static void main(String[] args) {
		Order order1 = new Order(2,"Aohit", 30);
		Order order2 = new Order(1,"Mohit", 20);
		Order order3 = new Order(4,"Lohit", 10);
		List<Order> orders = new ArrayList();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		Collections.sort(orders);
		
		
		System.out.println("orders sorted by id are " + orders);
		Collections.sort(orders,new Order.OrderByAmount());
		System.out.println("Orders sorted by amount are " +  orders);
		Collections.sort(orders,new Order.OrderByName());
		System.out.println("Orders sorted by name are " + orders);
		
				
	}
	
	
	
	@Override
	public String toString() {
	
		return "[" + id + "]";
	}

}
