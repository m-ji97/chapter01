package com.javaex.ex01;

public class Ex08 {
	
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		int val01 = a+b;
		System.out.println(a+b);
		System.out.println(val01);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //나누기 --> 몫
		System.out.println(a%b); //나누기 --> 나머지
		////System.out.println(a+b); = System.out.println(val01); 동일
		//계산할께 많을 경우 묶어주는 게 좋음
		
		System.out.println("-----------------------");
		//%연산자 자세히
		System.out.println(7/2); // 3
		System.out.println((double)7/2); // 3.5
		System.out.println(7/(double)2); // 3.5
		System.out.println((double)7/(double)2); // 3.5
		System.out.println(7.0/2); // 3.5
		System.out.println(7%2); // 1
		System.out.println(7.0%2); // 1.0
		
		System.out.println("-----------------------");
		int var = -3;
		int pvar = +var; // +(-3) ==> -3
		int mvar = -var; // -(-3) ==> 3
		System.out.println(pvar);
		System.out.println(mvar);
		
	}

}
