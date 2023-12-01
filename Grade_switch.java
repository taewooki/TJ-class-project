package com.javalec.base;

import java.util.Scanner;

public class Grade_switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 입력값	
		int score = 0;		// int 정수 변수
		String result= "";  // 문자 변수
		
		System.out.println("** 학점 관리 **");
		System.out.println();
		System.out.print("성적을 입력하세요 : ");
		
		
		score = scanner.nextInt();	//score 변수 지정
		if (score > 100 || score < 0) {
			System.out.println("점수를 다시 입력하세요");
			
		} else {				
	
		switch(score/10) { //score 를 10으로 나누어서 확인		
		case 10: case 9: // 하나의 변수			
			result = "A";
			break;
		case 8:
			result = "B";
			break;			
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		default:
			result = "F";
			break;
						
		}		
		System.out.println();
		System.out.println("귀하는" + result + "점 입니다.");		
		}		

	}

}
