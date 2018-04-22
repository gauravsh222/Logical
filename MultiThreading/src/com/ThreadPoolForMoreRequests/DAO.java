package com.ThreadPoolForMoreRequests;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	private List<String> list = new ArrayList<String>();
	public String save(String str) {
		str = str + " : " + str;
		list.add(str);
		System.out.println(str + " DAO...!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println(str + " Woke up");
		System.out.println();
		return str + " Saved";
	}
	
}
