package com.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRearrange {
	public static void main(String[] args) {
		Integer [] arr =  {3,5,3,5,5,4,6};
		rearrange(arr);
		reaarange1(arr);
	}

	private static void reaarange1(Integer[] arr) {
		for (int i = arr.length-1; i > 0;) {
			if(arr[i] == 5) {
				shift(arr, i);
			}
			else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr) );
	}

	private static void shift(Integer[] arr, int index) {
		for (int i = index; i > 0; i--) {
		   arr[i] = arr[i-1];
		}
		arr[0] = 1;
	}

	private static void rearrange(Integer[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 5) {
				count++;
			}
		}
		int [] arr1 = new int [arr.length];
		for (int i = 0; i < count; i++) {
			arr1[i] = 1;
		}
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] != 5) {
				arr1[count++] = arr[j];
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

	private static void think(Integer[] arr) {
		List<Integer> l = Arrays.asList(arr);
		int count=0;
		for (int j = 0; j < l.size(); j++) {
			if(l.get(j) == 5) {
				count++;
			}
		}
		
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			finalList.add(1);
		}
		finalList.addAll(l);
		System.out.println(finalList);
	}
}
