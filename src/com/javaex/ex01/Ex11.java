package com.javaex.ex01;

public class Ex11 {
	
	public static void main(String[] args) {
		int b = 10;
		System.out.println(b); //10
		System.out.println(b++); //10 *가상에서는 +1 되어있음 
		System.out.println(b); //11
		
		int c = 10;		
		System.out.println(c); //10
		System.out.println(c--); //10 *가상에는 -1 되어있음
		System.out.println(c); //9
		
		int d = 10;
		System.out.println(d);
		System.out.println(d++);
		System.out.println(d++);
		System.out.println(d);
		System.out.println(d--);
		System.out.println(d);
		
		//예제
		int no = 10;
		System.out.println(++no+3); //14 *no = 10
		System.out.println(no--+3); //13 *no = 10
		System.out.println(no); //9
		
		int no1 = 10;
		++no1;
		++no1;
		System.out.println(no1);
		
		int no2 = 10;
		no2--;
		++no2;
		System.out.println(no2);
				
	}
	
}
