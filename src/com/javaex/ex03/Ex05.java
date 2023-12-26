package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		
		int a = sc.nextInt();
		int b = a-8;
		int c = a*10000;
		 
		 
		if(a <= 8) {
			System.out.println("임금은 "+c+"원 입니다.");
		}else {
			double d = (80000 +b*(10000*1.5));
			System.out.println("임금은 "+d+"원 입니다");
			
		}
			
		sc.close();
	}

}
