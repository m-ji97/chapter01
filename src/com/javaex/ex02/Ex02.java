package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		
		//안내출력
		System.out.println("이름을 입력해주세요");
		//이름출력
		System.out.print("이름 : ");
		
		//이름 입력받기
		String name = sc.nextLine();
		
		//결과 출력
		System.out.print("당신의 이름은 "+name+" 입니다.");
		System.out.println();
		
		
		System.out.println("--------------------");
		
		
		//안내출력
		System.out.println("이름을 입력해주세요");
		
		//이름출력
		System.out.print("이름 : ");
		//이름 입력받기
		String name1 = sc.nextLine();
		//안내출력
		System.out.println("나이을 입력해주세요");
		//이름 입력받기
		System.out.print("나이 : ");
		//나이 입력받기
		int Age = sc.nextInt();
		//결과 출력
		System.out.print("당신의 이름은 "+name1+" 나이는 "+Age+" 입니다.");
		System.out.println();
		
		sc.close();
	}

}