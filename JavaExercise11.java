package com.javalec;

import java.util.Scanner;

public class JavaExercise11 {

	public static void main(String[] args) {

		// 11번
		// 몇 개의 숫자를 입력 할지 결정한 후
		// 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악.

		Scanner scanner = new Scanner(System.in);

		System.out.print("입력할 숫자의 갯수? :");
		int input = scanner.nextInt();
		int[] num4 = new int[input]; // 배열 이름

		System.out.println(input + "개의 숫자를 입력하세요! :");

		for (int i = 0; i < num4.length; i++) {
			System.out.print((i + 1) + " 의 숫자 :");
			num4[i] = scanner.nextInt(); // 배열 숫자의 입력.
		}
		System.out.print("검색할 숫자는? :");
		int checkNum = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < num4.length; i++) { // 조건식 입력.
			if (num4[i] == checkNum) {
				System.out.println(checkNum + "의 위치는 " + (i + 1) + "번째 입니다.");
				break; // 만족하면 다음 구문으로 실행되지 않음.
			} else if (i == num4.length - 1) {
				System.out.println(checkNum + "는 존재하지 않습니다.");
			}

		}

	}

}
