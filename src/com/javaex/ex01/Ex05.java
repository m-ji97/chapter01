package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		char ch01 = 'A';
		char ch02 = '황';
		///////////////////////
		//'한'= 한글자만 적용이 된다
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		char ch03 = 65;//이 경우 문자 코드로 알아들음
		System.out.println(ch03);
		
		char ch04 = '3';
		System.out.println(ch04);
		
		//char ch05 = '황'; //쌍따음표 안됨, 두글자도 안됨
		
		////////////////////////////////////////
		//String에는 쌍따음표, 작은따음표 안됨
		//"이","이미지"와 동일하게 적용됨
		
		String name = "이미지";//반드시 쌍따음표 사용 1글자 이상
		System.out.println(name);
		
		String name01 = "이";
		System.out.println(name01);
		
	}

}
