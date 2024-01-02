package com.javaex.ex05;

public class Ex08 {
	public static void main(String[] args) {
		int[] arrA = new int[] {10, 20, 30};
		int[] arrB = new int[] {10, 20, 30};

		/*if(arrA[0]<arrB[0] || arrA[0]>arrB[0]) {
			System.out.println("0번째 값이 다릅니다");
		}else if(arrA[1]<arrB[1] || arrA[1]>arrB[1]) {
			System.out.println("1번째 값이 다릅니다");
		}else if(arrA[2]<arrB[2] || arrA[2]>arrB[2]) {
			System.out.println("2번째 값이 다릅니다");	
		}
		 */

		//방갯수 비교
		if (arrA.length == arrB.length) {
			//방의 갯수가 같으면
			//세부검사

			for (int i=0; i<arrA.length; i++) {
				if(arrA[i] != arrB[i]) { //같은 방의 값이 다르면
					System.out.println(i+"번째 값이 다릅니다.");
				}

			}

		}else {
			//방의 갯수가 다르면
			System.out.println("두배열의 크기가 다릅니다.");
		}

	}

}
