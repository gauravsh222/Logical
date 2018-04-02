package com.arr;

public class MaxSubArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 0, -1, 2, -3, 5, 9, -5, 10 };
		int[] arr1 = new int[] { -2, -5, 6, -2, -3, 1, 5, -6 };
		findMaxSum(arr1);
		usingDP(arr1);
	}

	static void usingDP(int a[]) {
		int max = a[0];
		int curr = a[0];

		for (int i = 1; i < a.length; i++) {
			curr = Math.max(a[i], curr + a[i]);
			max = Math.max(max, curr);
		}
		System.out.println("Using DP : " + max);
	}

	private static void findMaxSum(int[] arr) {
		int max = arr[0];
		int curr = arr[0];
		int start = 0;
		int end = 0;

		for (int i = 1; i < arr.length; i++) {
			curr += arr[i];
			if (curr < 0) {
				curr = 0;
				start = i + 1;
			} else if (curr > max) {
				max = curr;
				end = i;
			}
		}
		System.out.println("Sum : " + max + ", Start : " + start + ", End : " + end);

	}
}
