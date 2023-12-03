package com.javelec;

import java.util.Scanner;

public class JavaExercise03 {

	public static void main(String[] args) {
		// 3번
		// 입력한 수의 factorial 구하기 (예: 4!=4x3x2x1)

		Scanner scanner = new Scanner(System.in);

		int fac = 1;

		System.out.print("Input your decimal no. : ");
		int input = scanner.nextInt();
		for (int i = 1; i <= input; i++) {
			fac *= i;
		}
		System.out.println(input+"'s factorial value = "+fac);
		scanner.close();

	}

}
