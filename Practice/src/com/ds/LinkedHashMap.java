package com.ds;

public class LinkedHashMap extends java.util.LinkedHashMap<String , Employee> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8467962529762442876L;

	
	public LinkedHashMap(int i) {
		super(i);
	}


	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<String, Employee> arg0) {
		System.out.println(size());
		return size() > 3;
	}
	
}
