package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 비교문, 조건문, Conditional Statement
		Scanner	scanner = new Scanner(System.in);
				
		int num1 = 0;
		int num2 = 0;
		String result = ""; // 판단 결과 (문자열 생성)
		
		System.out.print("첫번째 숫자를 입력하세요 :");
		num1 = scanner.nextInt();
		System.out.print("첫번째 숫자를 입력하세요 :");
		num2 = scanner.nextInt();
		
		
		// 숫자 2개 받아오기
		
		
		// num1이 num2보다 큰지 작은지 같은지 판단
		if(num1 > num2)	{
			result = "보다 큽니다.";
			
		} else if(num1 < num2 ){
			result ="보다 작습니다.";
			
		} else {
			result ="와 같습니다.";
		}
		
		
		System.out.println(">>>>> End <<<<<<<");
		

	}

}
