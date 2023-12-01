package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// -----------------------------------------------------
		// Desc : 사용자에게 정수를 입력 받아 짝수 인지 홀수 인지 판별한다.
		// Date : 2023.11.23
		// Author : Kenny
		// ------------------------------------------------------
		
		
		//Property
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0; // 사용자에게 입력받은 정수
		String result = ""; //짝수 인지 홀 수 인지 판단 결과
		
		// Input		
		System.out.println("정수를 입력하세요 :");
		inputNumber = scanner.nextInt();
		
		// Process
		
		// System.out.println(inputNumber % 2 == 0 ? ("입력하신" + inputNumber + "는 짝수 입니다." )
			//	: ("입력하신" + inputNumber + "는 홀수 입니다."));
		
		result = (inputNumber % 2 == 0 ? "짝수" : "홀수");
		
		// Output
		System.out.println("입력하신" + inputNumber + "는(은) " + result + " 입니다.");
		
				
		
	}

}
