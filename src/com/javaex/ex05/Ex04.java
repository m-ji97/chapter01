package com.javaex.ex05;

public class Ex04 {
	
	public static void main(String[] args) {
		
		double[] dArr = new double[3];
		dArr[0] = 3.5;
		dArr[1] = 7.2;
		dArr[2] = 12.8;
		//dArr[3] = 4; = dArr[3] = 4.0;
		
		//1개만 사용
		System.out.println(dArr[1]);
		
		//모두사용
		for (int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}

}
