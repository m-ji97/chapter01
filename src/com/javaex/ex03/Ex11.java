package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch (month) {
			
			case 2:
			System.out.println("28일");
			break;
			
			case 4:
			case 9:
			case 11:
			System.out.println("30일");
			break;
			
			default:
				System.out.println("31일");
				break;
		}
		sc.close();
	}
}
