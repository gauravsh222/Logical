package com.threads;

class NumberManager {
	private String str;
	private int count;
	
	public void generate() {
		synchronized (this) {
			while (true) {
				while (str != null) {
					try {
						System.out.println(Thread.currentThread().getName()
								+ " stop generating..!");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				str = "Data : " + ++count;
				System.err.println("Generate : " + str);
				System.out.println(Thread.currentThread().getName()
						+ " is notifying to printer..!");
				notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	public void print() {
		synchronized (this) {
			while (true) {
				while (str == null) {
					try {
						System.out.println(Thread.currentThread().getName()
								+ " stop printing..!");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.err.println("Print : " + str);
				str=null;
				System.out.println(Thread.currentThread().getName()
						+ " is notifying to generator ..!");
				notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}

	}
}

class Generator implements Runnable {
	private NumberManager manager;

	public Generator(NumberManager manager) {
		this.manager = manager;
	}

	@Override
	public void run() {
		manager.generate();
	}
}

class Printer implements Runnable {
	private NumberManager manager;

	public Printer(NumberManager manager) {
		this.manager = manager;
	}

	@Override
	public void run() {
		manager.print();
	}
}

public class NumberGenAndPrinter {
	public static void main(String[] args) throws InterruptedException {
		NumberManager manager = new NumberManager();
		Runnable generator = new Generator(manager);
		Thread t1 = new Thread(generator, "Generator");
		t1.start();

		Runnable printer = new Printer(manager);
		Thread t2 = new Thread(printer, "Printer");
		Thread.sleep(1000);
		t2.start();
	}
}
