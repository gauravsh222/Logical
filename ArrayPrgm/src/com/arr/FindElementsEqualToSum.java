package com.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindElementsEqualToSum {
	public static void main(String[] args) {
//		new FindElementsEqualToSum().findUsingMap(new int [] {7,9,12,5,3,2,1,6,8,4}, 10);
		new FindElementsEqualToSum().findUsingIteration(new int [] {7,9,12,5,3,2,1,6,8,4}, 10);
	}

	private void findUsingIteration(int[] arr, int x) {
		int i=0,j=arr.length-1;
		Arrays.sort(arr);
		while (i < j) {
			int l = arr[i];
			int r = arr[j];
			if(l + r == x) {
				System.out.println("Elements are : " + l + " and " + r);
				i++;
			} else if((l+r) < x) {
				i++;
			} else if((l+r) > x){
				j--;
			} else {
				System.out.println("There is no matching elements.");
			}
		}
	}

	private void findUsingMap(int[] arr, int x) {
		Map<Integer, FindElementsEqualToSum> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			if(map.containsKey(n)) {
				System.out.println("Numbers equals to sum are : " + n + " and " + (x-n));
			} else {
				map.put(x-n, this);
			}
		}
	}
	
}
