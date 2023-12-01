package com.javalec.base;

public class Main2 {

	public static void main(String[] args) {
		// 평균 구하기

		// String[] str = {"a"."B"}; String[]
		// int[] intNum = {1,2};
		// double[] doubleNum = {1.2, 2.3};
		// boolean[] boolNum = {true, false};

		// -----------------------------

		// 평균 구하기

		// int[] intNum = { 1, 5, 8, 12, 200, 1002 };

		// total 구하기

		// double sum = 0; //변수 생성
		// double aver = 0; // 변수 생성

		// System.out.println(intNum.length);

		// for (int i = 0; i < intNum.length; i++){
		// sum += intNum[i];

		// }
		// aver = sum/intNum.length;

		// System.out.println("합계 : " + sum +" / 평균 :"+aver);
		// ------------------------------------------
		// 평균 구하기
		// int[] intNum = {30,30,100,100,200};

		// total 구하기
		// double sum=0; //변수 생성

		// System.out.println(intNum.length);
		// for (int i = 0; i< intNum.length; i++ ) {
		// sum += intNum[i];
		// }
		// System.out.println(sum);

		// 평균구하기

		// System.out.println(sum/intNum.length);

// ----------------------------------------------

		// int[] intnum = { 100, 200, 300 };
		// double sum = 0;
		// 합계 구하기

		// System.out.println(intnum.length);
		// for (int i = 0; i < intnum.length; i++) {
		// sum += intnum[i];
		// }
		// System.out.println(sum);

		// 평균 구하기
		// System.out.println(sum / intnum.length);

		// -----------------------------------------

		// --------------------------------------------------------------

		// 배열 구구단 : 가로로 출력하기

//		int[] danNum = {5,3,9};

//		for (int i = 1; i<=9; i++) {
//			for(int j=0; j < danNum.length; j++) { //배열에서 불러오는 값 만들어줌.

//			System.out.print( danNum[j] + " x " + i + " = " + danNum[j]*i + "\t"); // 아님 System.out.println( danNum[1] + " x " + i + " = " + danNum[1]*i + "\t");
		// 아님 System.out.println( danNum[2] + " x " + i + " = " + danNum[2]*i + "\t");

//		}
//		System.out.println();		// 칸을 나누어 

		// ------------------------------------------------------

		// 배열 구구단 : 가로로 출력하기

		int[] danNum = { 2, 9, 3 };

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < danNum.length; j++) {
				System.out.print(danNum[j] + " x " + i + " = " + danNum[j] * i + "\t");
			}

			System.out.println();

		}
// -------------------------------------------------------------------------
	}

}
