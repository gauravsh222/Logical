package com.arr;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {

		int[] a1 = new int[] { 1, 4, 5, 7, 9 };
		int[] a2 = new int[] { 2, 3, 6, 8, 10, 11, 12 };
		System.out.println(Arrays.toString(sort(a1, a2)));
	}

	private static int [] sort(int[] a1, int[] a2) {
		int[] arr = new int[a1.length + a2.length];
		int m = a1.length;
		int n = a2.length;
		int i = 0, j = 0, k = 0;

		while (i < (m > n ? n : m)) {
			if (a1[i] < a2[j]) {
				arr[k++] = a1[i++];
			} else {
				arr[k++] = a2[j++];
			}
		}

		while (i < m) {
			arr[k++] = a1[i++];
		}
		
		while (j < n) {
			arr[k++] = a2[j++];
		}
		return arr;
	}
}
