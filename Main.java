package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Switch
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		String result ="";
				
		System.out.print("숫자를 입력하세요 :");
		inputNumber = scanner.nextInt();
		
	//	if(inputNumber % 2 == 0) { //2 로 나누어 0인 값은 짝수 
	//		result = "짝수";			
	//	}else {
	//		result = "홀수";			
	//	}
		
		// Switch문 적용
		
		switch(inputNumber %2) { //case의 조건을 물어
		case 0:
			result = "짝수";
			break;
		case 1:
			result = "홀수";
			break;
		default:  // else와 같다.
			break;
			
		}
		
	System.out.println("입력하신 숫자 "+ inputNumber + "은(는)" +result + "입니다.");
	
	}

}
