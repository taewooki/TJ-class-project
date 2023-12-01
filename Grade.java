         package com.javalec.base;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int score = 0; // 변수 정의
		String gradeResult = ""; //문자일 경우

		System.out.println("** 학점 관리 **");
		System.out.print("성적을 입력하세요 : ");

		score = scanner.nextInt() / 10; // 입력받을 변수 정

		if (score > 100 || score < 0) { // 점수 이상일
			System.out.println("점수를 다시 입력하세요");
		} else { // 점수가 정상적일 경
			if (score <= 90)
				gradeResult = "A";
			else if (score <= 80)
				gradeResult = "B";
			else if (score <= 70)
				gradeResult = "C";
			else if (score <= 60)
				gradeResult = "D";
			else
				gradeResult = "F";

			System.out.println("귀하는" + gradeResult + "점 입니다.");

		}
	}

}
