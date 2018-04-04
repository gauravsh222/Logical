package com.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Ä", 500.0);
		Employee e2 = new Employee(2,"B", 200.0);
		Employee e3 = new Employee(3,"C", 300.0);
		Employee e4 = new Employee(4,"D", 400.0);
		Employee e5 = new Employee(1,"E", 500.0);
		List<Employee> list = getList(e1, e2, e3, e4, e5);
		System.out.println(list);
		/*Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				System.out.println(o1.id + " : " + o2.id);
				System.out.println(o1.id.compareTo(o2.id));
				System.out.println("------------------------");
				return o1.id.compareTo(o2.id);
			}
			
		});*/
		
		
		Collections.sort(list);
		System.out.println(list);
		
	}

	private static List<Employee> getList(Employee e1, Employee e2, Employee e3, Employee e4, Employee e5) {
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		return list;
	}
}
