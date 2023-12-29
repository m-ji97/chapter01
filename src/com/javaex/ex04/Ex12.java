package com.javaex.ex04;

public class Ex12 {
	public static void main(String[] args) {
			for (int no = 1; no<=20; no++) {
				if(no%2==0 || no%3==0) {
					continue;
				}
				System.out.println(no);	
			}
	}

}
