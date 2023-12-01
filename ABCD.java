package com.javalec.base;

import java.util.Scanner;

public class ABCD {

	public static void main(String[] args) {
		
		// 비교문, 조건문, Conditional Statement
					Scanner	scanner = new Scanner(System.in); // 외부입력 데이터 
							
					int num1 = 0;
								
					String result = ""; // 판단 결과 (문자열 생성)
					
					System.out.print("학점을 입력하세요 :");
					num1 = scanner.nextInt();
								
					// 숫자  받아오기
					
				
					
					// num1이 num2보다 큰지 작은지 같은지 판단
					
					if(num1<0 || num1>100) {
						result ="다시입력하세요";   //범위 우선지정 
					}
					else if(num1 <= 100 && num1 >=90)	{
						result = "A";
						
					} else if(num1 >= 80 ){
						result = "B";
						
					} else if(num1 >= 70 ) {
						result = "C";
						
	                } else if(num1 >= 60 ) {
	                	result = "D";
	                	
					} else {
						result ="F";
					
				 }
				
					System.out.println(result);
					System.out.println(">>>>> End <<<<<<<");
					

				}
			}

