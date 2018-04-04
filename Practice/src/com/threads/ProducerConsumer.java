package com.threads;

import java.util.ArrayList;
import java.util.List;

class Order {
	List<Food> list = new ArrayList<>();

	public void serveOrder() throws InterruptedException {
		while(true) {
			synchronized (this) {
				if (list.isEmpty())
					wait();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				System.out.println("------------------------------------------------------------------------------------------");
				list.clear();
				notify();
			}
		}
	}

	public void prepareOrder() throws InterruptedException {
		while(true) {
			synchronized (this) {
				if (!list.isEmpty())
					wait();
				for (int i = 0; i < 100; i++) {
					System.out.println("Adding : " + "Order - " + i);
					list.add(new Food("Order - " + i));
				}
				notify();
			}
		}
	}
}

class Waiter implements Runnable {
	Order order;

	public Waiter(Order order) {
		this.order = order;
	}

	@Override
	public void run() {
		try {
			order.serveOrder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Chef implements Runnable {
	Order order;

	public Chef(Order order) {
		this.order = order;
	}

	@Override
	public void run() {
		try {
			order.prepareOrder();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ProducerConsumer {
	public static void main(String[] args) {
		Order order = new Order();
		Thread waiter = new Thread(new Waiter(order));
		Thread chef = new Thread(new Chef(order));

		waiter.start();
		chef.start();
	}
}
