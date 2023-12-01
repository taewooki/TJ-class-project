package com.javalec.base;

import java.util.Scanner;

public class Testing3 {

	public static void main(String[] args) {
		
		// 입력받을 변수 생성
		
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		double average = 0; // 변수의 소수점 때문에 double 을 사용
	
		// 입력받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요! ");
		score1 = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요! ");
		score2 = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요! ");
		score3 = scanner.nextInt();
		average = ((score1+score2+score3)/3.0); // 정수로 표현시 3.0 으로 뒷자리표현
	
		System.out.println("평균점수 :" + average);
		
		// 비교와 출력하기
		
		if (score1 > average ) {
			System.out.println("국어 점수는 평균 보다 높습니다. ");
		} else if (score1 < average ) {
			System.out.println("국어 점수는 평균 보다 낮습니다. ");
		} else if (score1 == average ) {
			System.out.println("국어 점수는 평균 점수 입니다. ");	
		
			
		}  // else if 는 계속 연결
		
		if (score2 > average ) {
			System.out.println("영어 점수는 평균 보다 높습니다. ");
		} else if (score2 < average ) {
			System.out.println("영어 점수는 평균 보다 낮습니다. ");		
		} else if (score2 == average ) {
			System.out.println("영어 점수는 평균 점수 입니다. ");	
		
		} 
		
		if (score3 > average ) {
			System.out.println("수학 점수는 평균 보다 높습니다. ");
		} else if (score3 < average ) {
			System.out.println("수학 점수는 평균 보다 낮습니다. ");		
		} else if (score3 == average ) {
			System.out.println("수 점수는 평균 점수 입니다. ");		
			
		}
		
	}

}
