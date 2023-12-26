package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		//일반적인 경우
		double pi = 3.14;
		double result = pi*5*5;
		System.out.println(result);
		
		//pi 값을 변경하는 경우
		pi = 3.141519;
		double circlerArea = pi*5*5;
		System.out.println(circlerArea);
		
		/////////////////////////////
		////////
		//상수로 정의할 때 *대문자로 표기 
		
		//final이 들어간 경우 수정이 안됨
		//final 변수명인 경우 대문자로 적어주는 게 좋다.
		
		final double pi2 = 3.14;
		double result02 = pi2*5*5;
		System.out.println(result02);
		
		//아래 주석(final~)처럼 넣었을 경우, 숫자 수정이 안됨
		//pi2 = 3.141519; // 상수값을 변경하려고 할 때 오류 확인
		double circlerArea2 = pi2*5*5;
		System.out.println(circlerArea2);
		
	}

}
