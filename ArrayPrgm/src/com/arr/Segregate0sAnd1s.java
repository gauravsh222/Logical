package com.arr;

import java.util.Arrays;

public class Segregate0sAnd1s {
	public static void main(String[] args) {
		int [] arr = segregatge(new int [] {1,1,0,1,0,1,0,1,0});
		System.out.println(Arrays.toString(arr));
	}

	private static int[] segregatge(int[] a) {
		
		int i=0,j=a.length-1;
		while (i < j) {
			if(a[i]==0 && a[j]==1) {
				i++;j--;
			} else if(a[i]==0 && a[j]==0) {
				i++;
			} else if(a[i]==1 && a[j]==1) {
				j--;
			} else if(a[i]==1 && a[j]==0) {
				swap(a,i,j);
				i++;j--;
			} else {
				break;
			}
		}
		return a;
	}

	private static void swap(int[] a, int i, int j) {
		a[i]=0;
		a[j]=1;
	}
}
