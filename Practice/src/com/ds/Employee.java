package com.ds;

public class Employee implements Comparable<Employee> {
	
	Integer id;
	String name;
	Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public int compareTo(Employee o2) {
		System.out.println(this.id + " : " + o2.id);
		System.out.println("------------------------");
		if(this.id.equals(o2.id)) {
			System.out.println("Salary : " + this.salary + " : " + o2.salary);
			if(this.salary.equals(o2.salary)) { 
				System.out.println("Name : " + this.name + " : " + o2.name);
				return this.name.compareTo(o2.name);
			}
			return this.salary.compareTo(o2.salary);
		} 
		return this.id.compareTo(o2.id);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
