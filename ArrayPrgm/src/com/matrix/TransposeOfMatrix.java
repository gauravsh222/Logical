package com.matrix;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int [][] arr = new int [][] {{1,2,3},{4,5,6}};
		printMatrix(arr, 2, 3);
		System.out.println("--------------");
		transposeMatrix(arr, 2, 3);
	}

	private static void transposeMatrix(int[][] arr, int row, int col) {
		for (int c = 0; c < col; c++) {
			for (int r = row-1; r >= 0; r--) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

	private static void printMatrix(int[][] arr, int row, int col) {
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				System.out.print(arr[r][c]+ " ");
			}
			System.out.println();
		}
	}
}
