package com.arr;

public class MaxDifference {
	public static void main(String[] args) {
		int diff = findMaxDifference(new int [] {7,9,5,6,3,2});
		System.out.println(diff);
	}

	private static int findMaxDifference(int [] arr) {
		int min=0;int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[max]) {
				max=i;
			} else if(arr[i] <= arr[min] && i < max) {
				min=i;
			}
		}
		return (arr[max] - arr[min] > 0 ? arr[max] - arr[min] : -1);
	}
}
