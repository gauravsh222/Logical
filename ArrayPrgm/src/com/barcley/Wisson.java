package com.barcley;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Wisson {
	public static void main(String[] args) {
		Map<String,List> map = new java.util.HashMap<String,List>();
		List<Double> l = new ArrayList<Double>();
		l.add(1.2);
		map.put("hello", l);
		map.get("hello").add(2.2);
		System.out.println(map.get("hello"));
		for(Double d : l) {
			System.out.println(d);
		}
		String symbol = null; double price = 0;
		if(map.containsKey(symbol)) {
	        List<Double> list = map.get(symbol);
	        list.add(price);
	        map.put(symbol, list);
	    } else {
	        List<Double> l2 = new ArrayList<Double>();
	        l2.add(price);
            map.put(symbol, l2);
	    }
	}
	
	
	// select e2.id, e2.name from Employee e1 join Employee e2 on e1.manager_id=e2.id group by e1.manager_id having count(e1.manager_id) > 1;
}
