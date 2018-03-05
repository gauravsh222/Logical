package com.ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Monk {
	 public static void main(String args[] ) throws Exception {
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        Integer q = Integer.valueOf(br.readLine());
	        int [] stack = new int[q];
	        int size=0;
	        for(int i=0; i<q; i++) {
	            String line = br.readLine();
	            if("1".equals(line)) {
	                // remove element
	                if(size != 0){
	                   System.out.println(stack[--size]);
	                }
	                else {
	                    System.out.println("No Food");
	                }
	            } else {
	                // add new price at end of array
	                String [] arr = line.split(" ");
	                stack[size++] = Integer.valueOf(arr[1]);
	            }
	        }
	    }
}