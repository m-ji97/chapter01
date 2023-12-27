package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		
		int g = sc.nextInt();
		
		if (90 <= g) {
			System.out.println("A등급");
		}else if(80 <= g) { //else if(90 > g && 80 <= g)
			System.out.println("b등급");
		}else if(70 <= g){ //else if(80 > g && 70 <= g)
			System.out.println("c등급");
		}else if(60 <= g){ //else if(70 > g && 60 <= g)
			System.out.println("d등급");
		}else // if(60 >g){ //else if(60 > g)
			System.out.println("f등급");
		
	sc.close();		
}
}
