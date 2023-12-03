package com.javalec;

import java.util.Scanner;

public class JavaExercise7 {

	public static void main(String[] args) {

		// 7번 
		//숫자 삼각형에 프로그램 작성.
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("몇 단계의 파라미드로 구성할까 ? : ");
		int num = scanner.nextInt();
		int[] count = new int[num]; // 입력 배열 만들기
		int sum = 0;
		for (int i = 1; i <= count.length; i++) { // 세로 배열 5줄

			for (int j = 0; j < i; j++) { // 가로 배열 수 수식,출력 숫자 15개 확인.
				sum++; // 누적 합계.
				System.out.print(sum + " "); // 값 출력
			}
			System.out.println(); // 줄 바꾸어 출력
			scanner.close();
		}

	}

}
