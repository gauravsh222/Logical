package com.matrix;

public class PrintDiagonalsOfMatrix {
	public static void main(String[] args) {
		int [][] arr = new int [][] {{1,2,3}, {4,5,6}, {7,8,9}};
		printMatrix(arr);
		System.out.println("-----------------------------------");
		printDiagonals(arr);
	}

	private static void printDiagonals(int[][] arr) {
		for (int r = 0,c=0; r < arr.length && c < arr.length; r++, c++) {
			System.out.print(arr[r][c] + " ");
		}
		System.out.println();
		for (int r = arr.length-1, c=0; r >=0 && c < arr.length; r--, c++) {
			System.out.print(arr[r][c] + " ");
		}
	}

	private static void printMatrix(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr.length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
