package com.javalec.base;

import java.util.Scanner;

public class Main_dec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ---------------------------------------------
		// Scanner scanner = new Scanner(System.in);
		// int num= 0;
		// int sum=0;
		// System.out.print("몇개의 숫자를 더할까요 ?");
		// num = scanner.nextInt();
		// for (int i=0; i< num; i++) {
		// System.out.println((i+1));
		// sum += i;
		// }

		// System.out.println("합계 : 입력한 숫자의 합은 " +sum+ " 입니다.");
		// 다시보기
		// ----------------------------------------

		// Scanner scanner = new Scanner(System.in);

		// int num =0;
		// int cout=0;

		// System.out.print("몇 단계의 파라미드로 구성할까 ? :");
		// num = scanner.nextInt();

		// for (int i=1 ; i<= num; i++) {
		// for (int j=1; j<=i ; j++) {
		// System.out.print(num);
		// } System.out.println();
		// 다시보기
		// -----------------------------------------------

		// Scanner scanner = new Scanner(System.in);

		// int num = 0;
		// int input=0;
		// int max =0;
		// System.out.println("입력할 숫자의 갯수 ? (100개 미만) : ");
		// num = scanner.nextInt();
		// System.out.println( num +" 개의 숫자를 입력하세요!");

		// for (int i=0; i<num; i++) {
		// input= scanner.nextInt();
		// if (input > max) {
		// max = input;

		// }
		// }
		// System.out.println(input);
		// System.out.println("입력한 숫자중 최대값은 "+ "이고 "+ "번째 값 입니다. ");

		// 다시보기
		// --------------------------------------------------------------------

		// 학생수가 4병이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가

		// String[] name = { "No1", "No2", "No3", "No4" };
		// Scanner scanner = new Scanner(System.in);
		// int[] num = new int[4];
		// int[] total = new int[4];
		// double[] aver= new double[4];

		// System.out.println("Korean의 성적을 입력 : ");

		// for (int i = 0; i < num.length; i++) {
		// System.out.print(name[i] + " 의 성적은 :");
		// num[i] = scanner.nextInt();
		// }
		// System.out.println("English의 성적을 입력 : ");
		// for (int j = 0; j < num.length; j++) {
		// System.out.print(name[j] + " 의 성적은 :");
		// num[j] = scanner.nextInt();
		// }
		// System.out.println("Mathematics의 성적을 입력 : ");
		// for (int k = 0; k < num.length; k++) {
		// System.out.print(name[k] + " 의 성적은 :");
		// num[k] = scanner.nextInt();
		// }
		// total[0]=num[0+num[0]+num[0]];
		// total[1]=num[1+num[1]+num[1]];
		// total[2]=num[2+num[2]+num[2]];
		// total[3]=num[3+num[3]+num[3]];
		// aver[0]=total[0]/4;
		// aver[1]=total[1]/4;
		// aver[2]=total[2]/4;
		// aver[3]=total[3]/4;

		// System.out.print("\t"+"Korean"+"\t"+"English"+"\t"+"Mathematics"+"\t"+"Total"+"\t"+"Average"+"\t");
		// System.out.print(total[0] + "\t" );
		// System.out.print(total[1] + "\t");
		// System.out.print(total[2] + "\t");
		// 다시하기

		// ------------------------------------------------
		// 몇 개의 숫자를 입력 할지 결정한 후
		// 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악.

		// Scanner scanner = new Scanner(System.in);
		// int input= 0;
		// int num[] = new int[4];

		// System.out.print("입력할 숫자의 갯수? : ");
		// input = scanner.nextInt();
		// System.out.println(input +" 개의 숫자를 입력하세요! :");

		// for (int i = 0; i < input; i++) {
		// num[i]=scanner.nextInt();
		// System.out.print(num[i]+" 의 숫자 : ");
		//
		// num[i] = scanner.nextInt();

		// }
		/// 다시하기
		// ----------------------------------------------------
		// 10개의 점수(0점 부터 99점)를 입력받아 점수의 분포를 10점 간격의 등급으로된 히스토 그램을 표시하라.

		// int[]num = new int[10];

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Input score : ");
		// for (int i = 0; i < num.length; i++) {
		// System.out.print((i + 1) + "의 score : ");
		// int kk = scanner.nextInt(); //입력값의 변수 계산
		// num[kk/10]++; //나눗
		// }
		// scanner.close();

		// System.out.println("--------Histogram--------");

		// for(int i=(num.length -1 ); i>=0; i--) {
		// System.out.print(String.format("%3d : ", i*10));
		// for(int j=1; j <= num[i]; j++) {
		// System.out.print("#");
		// }
		// System.out.println();

		// 다시 해보기
		// ------------------------------------------------
		// }
		// 몇개의 숫자를 입력할지 결정한후
		// 숫자를 입력하고 입력된 위치에 새로운 숫자를 삽입

		int[] num = new int[4];
		String[] newArray = new String[num.length + 1];

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 숫자의 갯수? :");
		int kk = scanner.nextInt();
		System.out.println(kk + " 개의 숫자를 입력하세요!:");
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "의 숫자 : ");
			num[i] = scanner.nextInt();

		}
		System.out.print("숫자를 삽입하고자 하는 위치는 ? :");
		int jj = scanner.nextInt();
		System.out.print("삽입하고자 하는 수는 ? ");

		int ll = scanner.nextInt();
		System.out.println("--------결과---------");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}
}
