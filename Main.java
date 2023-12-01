package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//입력받을 변수
		
		double score1 = 0;
		double score2 = 0;
		double bmi = 0;
		String bmiResult = "";  // 문자 출력을 위한 변수
		
		
		// 입력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("** BMI 계산기 **");
		System.out.println();
		System.out.print("신장(cm)을 입력하세요 :");
		score1 = scanner.nextInt();  //nextDouble
		System.out.print("몸무게(Kg)를 입력하세요 :");
		score2 = scanner.nextInt(); //nextDouble
		System.out.println();
		bmi = score2/((score1/100)*(score1/100));
		
		// 비교하기
		
		if (bmi <= 18.4) 
	    	bmiResult = "저체중";
		 else if (bmi >= 18.5 && bmi <= 22.9)	// && 조건	
			bmiResult ="정상체중";
		 else if (bmi >= 23 && bmi <= 24.9)		
				bmiResult ="과체중";
		 else if (bmi >= 25 && bmi <= 29.9)		
				bmiResult ="비만";
		 else 	
				bmiResult ="고도비만";
		
					
		// 출력
		System.out.println("(결과) 귀하는 " + bmiResult + " 입니다." );		
		

	}

}
