package com.arr;

import java.util.Arrays;

public class RotateArray {
	 static int[] leftRotation(int[] a, int d) {
	        // Complete this function
	        for(int i = 0; i < d; i++){
	            int temp = a[0];
	            for(int j = 0; j < a.length; j++) {
	                a[j] = a[j+1];
	            }
	            a[a.length-1]=temp;
	        }
	        return a;
	    }
	 public static void main(String[] args) {
		int [] arr = new int[] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(leftRotation(arr, 4)));
	}
}
