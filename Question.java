package com.javalec;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// -----------------------------------------------
//		Scanner scanner= new Scanner(System.in);
//		double r= 0;
//		double V= 0;
//		double S= 0;

//		System.out.print("r 값을 입력하세요: ");
//		r=scanner.nextInt();

//		V= (((4/3)*3.14)* r*r*r);
//		S= ((4*3.14)*r*r);

//		System.out.println("V : " + V );
//		System.out.println("S : " + S );

		// -------------------------------------------------

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		

		System.out.print("값을 입력하세요 : ");
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");

		}
	}

}
