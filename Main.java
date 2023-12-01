package com.javalec.base;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		
		// 사용자에게 입력받기! (정수)	
		Scanner	scanner = new Scanner(System.in);
		
		
	//	System.out.print("정수를 입력하세요 :");
	//	int inputNum = scanner.nextInt();
	//	System.out.print("입력된 숫자는" + inputNum + "입니다.")
		;
	
		
	// 사용자가 입력한 숫자가 짝수 인지 홀수 인지 출력하기
		
		System.out.print("정수를 입력하세요 :");
		int inputNum2 = scanner.nextInt(); 
		System.out.print( inputNum2%2==0? "짝수" : "홀수" );
		
		
	}

}
