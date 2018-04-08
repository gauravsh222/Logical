package com.pattern.factory;

public class Test {
	public static void main(String[] args) {
		Way way = TravelFactory.getInstance("FLY");
		way.travel();
	}
}
