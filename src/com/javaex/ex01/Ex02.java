package com.javaex.ex01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//byte
		byte no = 127;
		
		//no = -129; //byte형의 범위를 벗어남
		
		System.out.println(no);
		
		////////////////////////////////
		//int
		int num = -2147483647;
		
		System.out.println(num);
		
		////////////////////////////////
		//long
		//int의 범위를 벗어난 숫자는 맨뒤에 L을 붙여야한다
		//팁 향상L
		long num2 = -9223372036854775808l;
		
		System.out.println(num2);
		
		////////////////////////////////
		//변수선언, 초기화
		////////////////////////////////
		
		//변수선언
		int ver01;
		int ver02;
		int ver03;
		//int ver01, ver02, ver03;
		
		//초기화 대입
		ver01 = 10;
		ver02 = 20;
		ver03 = 30;
		
		//출력
		System.out.println(ver01);
		System.out.println(ver02);
		System.out.println(ver03);
		
		////////////////////////////////
		
		int ver04 = 100;
		int ver05 = 200;
		int ver06 = 300;
		//int ver04 = 100, ver05 = 200, ver06 = 300;
		
		System.out.println(ver04);
		System.out.println(ver05);
		System.out.println(ver06);
		
		//System.out.println(); = sysout + ctrl + 스페이스바
		
		
	}

}