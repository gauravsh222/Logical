package com.barcley;

import java.util.Arrays;

public class ShiftArrayAndReplaceWithOne {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = new int[] {3,5,3,5,5,11,5};
		int count=0;
		for (int i = arr.length-1; i >= 0 ;) {
			if(arr[i]==n) {
				for(int j = i-1; j >= count ; j--) {
					arr[j+1] = arr[j];
				}
				arr[count++] = 1;
			}else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
