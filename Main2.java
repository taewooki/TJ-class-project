package com.javalec.base;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// 비교문, 조건문, Conditional Statement
			Scanner	scanner = new Scanner(System.in);
					
			int num1 = 0;
						
			String result = ""; // 판단 결과 (문자열 생성)
			
			System.out.print("금액을 입력하세요 :");
			num1 = scanner.nextInt();
						
			// 숫자  받아오기
			
		
			
			// num1이 num2보다 큰지 작은지 같은지 판단
			if(num1 <= 3000)	{
				result = "싼편 입니다.";
				
			} else if(num1 > 3000 & num1 < 5000){
				result ="적당한 금액 입니다.";
				
			} else if(num1 > 5000 & num1 <8000) {
				result ="조금 비쌉니다.";
				}
			 else {
			   result ="너무 비쌉니다.";
		 }
		
			System.out.println(result);
			System.out.println(">>>>> End <<<<<<<");
			

		}
	}


