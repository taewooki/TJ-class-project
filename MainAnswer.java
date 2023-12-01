package com.javalec.base;

import java.util.Scanner;

public class MainAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, firstNum = 0;
		int num2 = 0, secondNum = 0;
		int tot = 0; 		//총합
		int totCount = 0; 	//총합 횟
		int oddtot = 0; 	//홀수총합
		int oddtotCount = 0; //홀수총합 횟수
		int eventot = 0; 	//짝수총합
		int eventotCount = 0; //짝수총합 횟수
		
		
		
		System.out.print("덧셈 시작 수를 입력하세요 : ");
		num1 = scanner.nextInt();
	//	System.out.print(num1);
				
		
		System.out.print("덧셈 끝 수를 입력하세요 : ");
		num2 = scanner.nextInt();
	//	System.out.print(num2);
		
		// 시작숫자와 끝숫자를 비교해서 시작과 끝을 정렬하자!
		if(num1 > num2) {
			firstNum = num2; // fristNum에 num2를 사용
			secondNum = num1;
		}else {
			firstNum = num1;
			secondNum = num2;
		}
		
	// System.out.println(firstNum + "/" + secondNum);
	
		//숫자의 총합 구하기
		for(int i=firstNum; i<= secondNum; i++) {
			tot += i; //숫자의 총합 구하기
			totCount ++; //숫자의횟수 구하기
			if(i % 2 == 1) { //홀수인 경우
				oddtot += i;
				oddtotCount ++;
			}else {		//짝수인 경우
				eventot += i;
				eventotCount ++;
				
			}
					
		}
		
		//출력하기
		System.out.println("결과: ");
		System.out.println("1)숫자의 총합은 " + tot + " 평균은 " + tot / totCount + " 입니다. ");
		System.out.println("2)홀수의 총합은 " + oddtot + " 평균은 " + oddtot / oddtotCount + " 입니다. ");
		System.out.println("3)짝수의 총합은 " + eventot + " 평균은 " + eventot / eventotCount + " 입니다. ");
		
		
	}

}
