package com.javalec.base;

import java.util.Scanner;

public class Main_quiz {

	public static void main(String[] args) {
		// 신장이 가장 크거나 작은 학생의 이름과 신장을 출력하기
		String[] name = { "James", "Cathy", "Kenny", "Martin", "Crystal" };
		Scanner scanner = new Scanner(System.in); // 입력받기
		int[] num = new int[5];
		int total = 0; // 평균점수 구하기위한 합
		//int max = num[0];
		//int min = num[0];
		 int max = Integer.MIN_VALUE; //주의 max는 integer.min.value,min는 max이다. 
		 int min = Integer.MAX_VALUE; // 
		 String maxName = ""; // 문자는 string 으로 "" 사용.
		 String minName = "";
		

		for (int i = 0; i < name.length; i++) {
			// for (int i = 0; i < name.length; i++)

			System.out.print(name[i] + " 의 신장을 입력하세요 : ");
			num[i] = scanner.nextInt();
			total += num[i];

		}
		System.out.println(total);
		System.out.println("평균 신장은 : " + (double)total / name.length);

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
				maxName = name[i];
			}
			if (num[i] < min) {
				min = num[i];
				minName = name[i]; // i 를 공동으로 사용 가능.
			}
		}

		System.out.println("가장 큰 학생은 :" + maxName + "이고 그 학색의 키는 " + max);
		System.out.println("가장 작은 학생은 :" + minName + "이고 그 학색의 키는 " + min);
	}
	// num = scanner.nextInt();

	// max = Math.max(max,num[j]); //max 값
	// min = Math.min(min,num[j]);

	// maxh = Math.max(maxh, num[i]);
	// maxName = (max[i]);

	// System.out.println(total);

	// if (max==num[0]) {
	// System.out.println(name[0]);}

	//
	//

	/*
	 * James의 신장을 입력하세요 : Cathy의 신장을 입력하세요 : Kenny의 신장을 입력하세요 : Martin의 신장을 입력하세요 :
	 * Crystal의 신장을 입력하세요 :
	 * 
	 * 평균 신장은 : 가장 큰 학생은 ___ 이고 그 학생의 키는____ 가장 작은 학생은 ___ 이고 그 학생의 키는_____
	 * 
	 */

}
