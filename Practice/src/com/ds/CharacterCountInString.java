package com.ds;

import java.io.IOException;
import java.util.Arrays;

public class CharacterCountInString {
	public static void main(String[] args) throws IOException {
		String str = "2245647865";
		int [] arr = new int[10];
        for(int i = 0; i < str.length(); i++) {
        	//System.out.println(str.charAt(i));
        	int index = Character.getNumericValue(str.charAt(i));
            arr[index]++;
        }
        // Write your code here
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " " + arr[i]);
        }

	}
}
