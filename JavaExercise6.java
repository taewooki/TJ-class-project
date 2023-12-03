package com.javalec;

import java.util.Scanner;

public class JavaExercise6 {

	public static void main(String[] args) {
			
		//6번
		// 더하기 할 숫자들의 개수를 정한 후 숫자를 입력 받아서
		// 입력한 숫자의 합을 구하는 프로그램 작성.

		Scanner scanner = new Scanner(System.in);

		System.out.print("몇개의 숫자를 더할까요 ? : ");
		int num = scanner.nextInt(); // 입력할 숫자 갯수.
		int[] input = new int[num]; // 입력 배열 만들기.
		int sum = 0;
		System.out.println(num + "의 숫자를 입력하세요");

		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt(); // 숫자 입력하기
			sum += input[i]; // 입력 받은 변수 합계 구하기
		}
		System.out.println("입력한 숫자의 합은 " + sum + " 입니다.");
	}

}
