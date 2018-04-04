package com.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SuffleInCollections {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(4);
		l.add(2);
		l.add(0);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.shuffle(l, new Random());
		System.out.println(l);
	}
}
