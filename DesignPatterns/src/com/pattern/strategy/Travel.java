package com.pattern.strategy;

import com.pattern.factory.Way;

public class Travel {
	private Way strategy;
	
	public Travel(Way strategy) {
		this.strategy = strategy;
	}
	
	public void travel(){
		strategy.travel();
	}
}
