package com.javaex.ex01;

public class Ex12 {
	
	public static void main(String[] args) {
		
		//관계연산자
		int n1 = 5;
		int n2 = 3;
		
		boolean result = 5<3; //동일 boolean result = n1<n2;
		System.out.println(result);
		System.out.println(n1<n2); //동일 System.out.println(result);
		System.out.println(n1>n2); // 5>3 t 작은가
		
		System.out.println(n1<=n2); // 5<=3 f 같거나 작은가
		System.out.println(n1>=n2); // 5>=3 t 같거나 큰가
		System.out.println(3>=n2); // 3>=3 t 같거나 큰가
		
		System.out.println(n1==n2); // 5==3 f 같은가 의문문
		System.out.println(n1!=n2); // 5!m3 t 다른가 의문문
		
	}

}
