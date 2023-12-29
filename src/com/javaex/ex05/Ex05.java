package com.javaex.ex05;

public class Ex05 {
	public static void main(String[] args) {
		
		int[] drr = new int[6];
		
		for (int i=0; i<drr.length; i++) {
			drr[i]=(int)(Math.random()*45)+1;
		}
		for (int i=0; i<drr.length; i++) {
			System.out.println(drr[i]);
		}
		
	}


}

