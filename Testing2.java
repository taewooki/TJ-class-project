package com.javalec.base;

import java.util.Scanner;

public class Testing2 {

	public static void main(String[] args) {

		// 입력 받을 변수 생성
		int score1 = 0;
		int score2 = 0;

		// 입력받기

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 :");
		score1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 :");
		score2 = scanner.nextInt();

		// 비교하기

		if (score1 > score2) {
			System.out.println("첫번째 숫자가" + (score1 - score2) + " 만큼 큽니다.");

		} else if (score1 < score2) {
			System.out.println("두번째 숫자가" + (score2 - score1) + " 만큼 큽니다.");

		}

	}

}
