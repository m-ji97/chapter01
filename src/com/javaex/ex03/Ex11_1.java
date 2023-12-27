package com.javaex.ex03;

import java.util.Scanner;

public class Ex11_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("28일");
		}else if(num == 2){
			System.out.println("31일");
		}
		sc.close();
	}

}
