package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		
		int a = sc.nextInt();
		int b = a-8;
		
		if (a <= 8) {
			int less = a*10000; 
			System.out.println("입금은 "+less+"원 입니다");
		}else { 
			int more = (80000+(b*12000));
			
			System.out.println("입금은 "+more+"원 입니다.");
		}
	sc.close();
	}

}
