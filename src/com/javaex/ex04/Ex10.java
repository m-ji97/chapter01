package com.javaex.ex04;

public class Ex10 {
	
	public static void main(String[] args) {
		int no = 1;
		
		//6의 배수 14의 배수
		//no%6 == 0; && no%14==0
		
		while(true) {
			if(no%6 == 0 && no%14==0) {
				System.out.println(no);
				break;
			}
			no++;
		}
	}

}
