package com.javalec;

import java.util.Scanner;

public class JavaExervise12 {

	public static void main(String[] args) {

		// 12번
		// 몇개의 숫자를 입력할지 결정한후 // 숫자를 입력하고 입력된 위치에 새로운 숫자를 삽입

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 숫자의 갯수? :");
		int input = scanner.nextInt(); // 숫자 입력 변수
		int[] num = new int[input];
		System.out.println(input + " 개의 숫자를 입력하세요!:");
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "의 숫자 : ");
			num[i] = scanner.nextInt();
		}
		System.out.print("숫자를 삽입하고자 하는 위치는 ? :");
		int inputPo = scanner.nextInt();
		System.out.print("삽입하고자 하는 수는 ? ");
		int inputNu = scanner.nextInt();
		scanner.close();
		int newValue = inputNu; // 새로운 숫자.
		int position = inputPo - 1; // 추가할 위치.
		int newNumLength = num.length + 1; // 새로운 배열의 길이.
		int[] newNum = new int[newNumLength]; // 새로운 배열의 생성.

		System.out.println("--------결과---------");
		for (int i = 0; i < newNum.length; i++) {
			if (i < position) {
				newNum[i] = num[i];
			} else if (i == position) {
				newNum[i] = newValue;
			} else {
				newNum[i] = num[i - 1];
			}
			System.out.println(newNum[i]);
		}

	}

}
