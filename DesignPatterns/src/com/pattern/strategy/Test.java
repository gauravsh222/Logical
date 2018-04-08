package com.pattern.strategy;

import com.pattern.factory.TravelFactory;
import com.pattern.factory.Way;

public class Test {
	public static void main(String[] args) {
		// Here we r using factory to create strategy from factory defined in other package
		Way way = TravelFactory.getInstance("FLY");
		// Here we are injecting strategy which we want to use
		Travel travel = new Travel(way);
		travel.travel();
	}
}
