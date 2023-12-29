package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] intArray = new int[6];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 30;
		intArray[5] = 90;
		
		for(int i=0; i<intArray.length; i++) { //변수명.length = 수정한 내용대로 받아온다
			System.out.println(intArray[i]);
		}
		
		/*
		System.out.println(intArray[0]);
		System.out.println(intArray[4]);
		*/
	}

}
