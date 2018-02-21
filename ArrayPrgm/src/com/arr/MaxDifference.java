package com.arr;

public class MaxDifference {
	public static void main(String[] args) {
//		int diff = find(new int [] {7,9,5,6,3,2});
//		int diff = find(new int [] {2,3,10,2,4,8,1,12});
		int diff = find(new int [] {4,1,3,2});
		System.out.println(diff);
	}

	private static int find(int [] arr) {
		int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
	        if (arr[i] < min_element) {
	            min_element = arr[i];
	        }
	        if (arr[i] - min_element > max_diff) {
	            max_diff = arr[i] - min_element;
	        }
        }
        return max_diff;
	}
}
