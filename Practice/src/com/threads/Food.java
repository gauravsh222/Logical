package com.threads;

public class Food {
	private String name;

	@Override
	public String toString() {
		return "Food [name=" + name + "]";
	}

	public Food(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
