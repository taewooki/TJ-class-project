package com.javalec.base;

public class Main {
	
	public static void main(String[] args) {

		//연산자 종류별 출력
		
		int num1 = 10;
		int num2 = 2;
		int num3 = 5;
		
		System.out.println("<<<산술 연산자>>>");
		System.out.println("<술 연산자>>>");
		System.out.println("<<<산술 연산자>>>");
		
		
		System.out.println("<<<자동 증감 연산자>>>");
	//	num1 = num1 + 1;
	//	num1 += 1; 
	//	덧셈으로 누적한다
		num1++;
		
		System.out.println("증가 : "+ num1);
	//	num1 - 1;
	//	num1 -= 1;
		num1--;
		System.out.println("감소 : "+ num1);
		
		System.out.println("<<< 동등 비교 관계 연산자 >>>");
		System.out.println("num1 == num2 :" + (num1==num2));
		System.out.println("num2 != num3 :" + (num2!=num3));
		System.out.println("num1 > num2 :" + (num1>num2));
		System.out.println("num1 < num2 :" + (num1<num2));
		System.out.println("num1 >= num2 :" + (num1>=num2));
		System.out.println("num1 <= num2 :" + (num1<=num2));
		
		System.out.println("<<< 논리 연산자 >>>");
		/*
		 * true && true => true
		 * true && false => false
		 * false && true => false
		 * false && false => false
		 *
		 * & and 조건
		 */
		
		System.out.println("num1 > num2 && num2 > num3 :" + ((num1>num2) && (num2>num3)));
		
		/* or 조건
		 * true || true => true
		 * true || false => true
		 * false || true => true
		 * false || false => false
		 */
		System.out.println("num1 > num2 || num2 > num3 :" + ((num1>num2) || (num2>num3)));
		
		
		System.out.println("<<< 삼항 연산자 >>>");
		// 7이 3의 배수인지 판
		System.out.println("7이 3의 배수인가? :" + (7 % 3 == 0 ? "3의배수" :"3의배수 아님"));
		String result = (7 % 3==0 ? "3의배수" : "3의배수 아님");
		System.out.println(result);
		
		
		
		String regiID = "abcd";
		int regiPW = 1234;
		
		String inputID ="qwe";
		int inputPW = 1234;
		
		System.out.println(regiID==inputID && regiPW==inputPW ?  "통과: 환영합니다" : "불통과 : id나 password를 다시 입력 하세요");
		
	
				
	
		
		
		
		
		
	
	}

}
