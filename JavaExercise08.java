package com.javalec;

import java.util.Scanner;

public class JavaExercise08 {

	public static void main(String[] args) {

		// 8번
		// 몇 개의 숫자를 입력할지 결정한 후 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라.

		Scanner scanner = new Scanner(System.in);

		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		int num = scanner.nextInt(); // 입력할 숫자 갯수
		int[] input = new int[num]; // 입력 배열 만들기.
		int max = input[0]; // 최대값 변수
		int locat = 0; // 자리 변수

		System.out.println(num + " 개의 숫자를 입력하세요!");

		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt(); // 숫자 입력하기
			if (max < input[i]) { // 최대값 식
				max = input[i];
				locat = i + 1; // 출력을 위해서 변수에 자릿값 입력
			}
		}
		scanner.close();
		System.out.println("입력한 숫자중 최대값은 " + max + "이고 " + locat + "번째 값 입니다.");

	}

}
