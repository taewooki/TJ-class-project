package com.javalec.base;

import java.util.Scanner;

public class Testing_01 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		int total = 0;
				
		System.out.print("덧샘 시작 수를 입력하세요 : ");
		number1 = scanner.nextInt();		 	
		System.out.print("덧샘 끝수를 입력하세요 : ");
		number2 = scanner.nextInt();
		
		for(int i=number1; i<=number2; i++) {
			total+=i;			
		}
		System.out.println();
		System.out.println("결과 : "+ number1+ "~" + number2+ "까지의 합은 " + total+" 입니다." );		
		
		
		
		

	}

}
