package com.javalec;

import java.util.Scanner;

public class JavaExercise05 {

	public static void main(String[] args) {
		// 5번
		// 입력한 한 자릿 수 정수의 합을 구하는 프로그램을 작성하라.
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter an integer(0~9) : ");
		int num= scanner.nextInt();
		int sum=0;
		
		while(num!=0) {
			sum+=num%10; //num을 10으로 나눈 나머지를 sum에 더한다.
			num/=10; // num을 10으로 나눈 값을 다시 num에 저장한다.
		}
		System.out.println("Sum of digits = "+ sum);
		scanner.close();

		
		

	}

}
