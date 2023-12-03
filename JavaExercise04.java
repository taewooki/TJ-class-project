package com.javalec;

import java.util.Scanner;

public class JavaExercise04 {

	public static void main(String[] args) {
		// 4번
		// 입력한 숫자부터 4개를 증가하여 화면 가로로 구구단을 표시하기.
		// (단 for문은 1개만 사용하기)

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your numer : ");
		int input = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.print(input + " X " + i + " = " + input * i + "\t");
			System.out.print((input + 1) + " X " + i + " = " + ((input + 1)) * i + "\t");
			System.out.print((input + 2) + " X " + i + " = " + ((input + 2) * i) + "\t");
			System.out.println((input + 3) + " X " + i + " = " + ((input + 3) * i) + "\t");
		}
		scanner.close();

	}

}
