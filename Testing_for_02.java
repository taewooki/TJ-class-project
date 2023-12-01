package com.javalec.base;

import java.util.Scanner;

public class Testing_for_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;   // 변수를 지
		int number2 = 0;
		int total = 0;
		int oddTot= 0;
		int eveTot= 0;
		double total2= 0;
		double oddTot2= 0;
		double eveTot2= 0 ;	
				
		System.out.print("덧샘 시작 수를 입력하세요 : ");
		number1 = scanner.nextInt();		 	
		System.out.print("덧샘 끝수를 입력하세요 : ");
		number2 = scanner.nextInt();
						
		if (number2 > number1) {
			for(int i=number1; i<=number2; i++) {
				total+=i;			
		} //if (number2 > number1) {
			{for (int i=number1; i<=number2; i++ ) {
				if(i % 2 == 1) {
					oddTot +=i;				
				}else {
					eveTot +=i;
				}
			}
		}
	}							
		if (number1 > number2) {
			for(int i=number2; i<=number1; i++) {
				total+=i;
		} //if (number1 > number2 ) {				
			{for (int i=number2; i<=number1; i++) {
				if(i % 2 == 1) {
					oddTot +=i;
				}else {
					eveTot +=i;
				}
			}			
		}
	}		
		total2 = total/2;
		oddTot2= oddTot/2;
		eveTot2= eveTot/2;
		
		System.out.println("결과 : ");
	//	System.out.println("결과 : "+ number1+ "~" + number2+ "까지의 합은 " + total+" 입니다." );		
		
		System.out.println("1) 숫자의 총합은 "+ total+ " 이며 " + "평균은 " + total2+".");
		System.out.println("2) 홀수의 총합은 "+ oddTot+ " 이며 " + "평균은 " + oddTot2+".");
		System.out.println("2) 짝수의 총합은 "+ eveTot+ " 이며 " + "평균은 " + eveTot2+".");
		
		}
	}


		
		

	
	
