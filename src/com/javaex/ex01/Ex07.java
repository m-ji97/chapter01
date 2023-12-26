package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		int var00 = 3+5;
		System.out.println(var00);
		
		//int ver02 = 3+3.5;
		int a = 3; //3.0으로 자동 형변환됨
		double b = 3.5;
		double ver02 = a+b;
		System.out.println(ver02);
		
		////
		//정수와 실수가 있으면 실수로 수정이 되어서 진행됨
		
		///////////////////////////////
		//강제행변환
		float ver04 = 1111.6345f;
		int ver05 = (int)ver04;
		System.out.println(ver04);
		System.out.println(ver05);
		///소수점 정리가 되는게 맞음
		
		///////////////////////////////
		//축소형변환(int --> byte)
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02); //값이 변화하지 않는다 이유공부
		
		//축소 형변환(int --> byte)
		int v03 = 203029770;
		byte v04 = (byte)v03;
		System.out.println(v04); //값이 변화는 이유공부
		
		//확대 형변환
		byte v05 = 127;
		int v06 = (int)v05;
		System.out.println(v06); //값이 그대로 나오는 이유공부
		
		///////////////////////////////////////////
		//실수-->정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 --> 실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
		System.out.println("-------------");
		
		//예제
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
		
		/*
		int v017 = (int)1.3+1.8;
		System.out.println(v017);
		*/
		
		double v017 = (int)1.3+1.8;
		System.out.println(v017);
		
	}

}