package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		int dan = sc.nextInt();
		int one = 1;
		
		while (one<=9) {
			System.out.println(dan+" * "+one+ " = "+ dan*one);
			
			one++;
		}
		
		
		
		sc.close();
	}

}
