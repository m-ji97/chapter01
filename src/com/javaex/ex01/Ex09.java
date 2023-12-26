package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] agrs) {
		
		double por = 7.14;
		float por1 = 7.14f;
		
		System.out.println(por);
		System.out.println(por1);
		
		System.out.println("------------------");
		
		int e = 6;
		int f = 2;
		
		boolean rsult = e < f;
		System.out.println(rsult);
		
		System.out.println("------------------");
		
		char c01 = 'b';
		System.out.println(c01);
		
		String g = "반갑습니다"; //String은 첫문자만 대문자가 되어야한다!
		System.out.println(g);
		
		System.out.println("------------------");
		
		double a = 3.14;
		double result = a*5*5;
		System.out.println(result);
		
		a = 5.4;
		double result01 = a*5*5;
		System.out.println(result01);
		
		////////////////////////////////
		final double b = 6.4;
		double aria = b*5*5;
		System.out.println(aria);
		
		System.out.println("------------------");
		
		int vol = 3;
		double vol01 = 6.5;
		System.out.println(vol+vol01);
		
		System.out.println("------------------");
		
		/*
		double v010 = 5/4;
		System.out.println(v010);
		
		double v011 = (double)5/4;
		System.out.println(v011);
		
		double v012 = 5/(double)4;
		System.out.println(v012);
		
		double v013 = (double)5/(double)4;
		System.out.println(v013);
		
		int v014 = (int)1.3+(int)1.8;
		System.out.println(v014);
		
		//응용
		int v015 = (int)(5/(double)4);
		System.out.println(v015);
		//int
		
		int v016 = (int)(1.3+1.8);
		System.out.println(v016);
		*/
		
		int a3 = 6/2;
		System.out.println(a3);
		
		double a1 = 6/2;
		System.out.println(a1);
		
		double a2 = (double)6/2;
		System.out.println(a2);
		
		double a4 = 6/(double)2;
		System.out.println(a4);
		
		double a5 = (double)6/(double)2;
		System.out.println(a5);
		
		double a6 = (int)1.3+1.8;
		System.out.println(a6);
		
		System.out.println("------------------");
		
		//정수는 int, 실수는 double
		
		int c = 8;
		int d = 4;
		
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d);
		System.out.println(c%d);
		
		////////////////////////////////////
		int vers = 6;
		int pvers = +vers;
		int mvers = -vers;
		
		vers = 8;
		int pvers1 = +vers;
		int mvers1 = -vers;
		
		System.out.println(pvers);
		System.out.println(mvers);
		System.out.println(pvers1);
		System.out.println(mvers1);
		
		final int yes = 9;
		int yes01 = +yes;
		int por2 = -yes;
		
		System.out.println(yes01);
		System.out.println(por2);
		
	}
	

}
