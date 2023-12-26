package com.javaex.ex01;

public class Ex13 {
	
	public static void main(String[] args) {

	//논리 연산자
	//&& and연산자
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	System.out.println("-----------------------");
	
	//|| or연산자
	System.out.println(true || true);
	System.out.println(false || false);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println("-----------------------");
	
	//예제
	int a = 5;
	int b = 7;
	
	System.out.println((a>b)&&(a<b)); // f&&t = f
	System.out.println((a>b)&&(a>b)); // f&&f = f
	
	System.out.println((a>b)||(a<b)); // f||t = t
	System.out.println((a<=b)||(a>=b)); // t||f = t
	System.out.println((a>b)&&(a<b)||(a<b)); // f&&f||t = t
	
	System.out.println((a<b)||(a>b)||(a>b)); // f||t = t
	
	System.out.println(!(a<b));
	}

}
