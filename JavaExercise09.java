package com.javalec;

import java.util.Scanner;

public class JavaExercise09 {

	public static void main(String[] args) {
	
		String[] name = { "No1", "No2", "No3", "No4" };
		Scanner scanner = new Scanner(System.in);
		int[] numK = new int[4];
		int[] numE = new int[4];
		int[] numM = new int[4];
		int[] total = new int[4];
		int[] aver = new int[4];

		System.out.println("Korean의 성적을 입력 : ");
		for (int i = 0; i < numK.length; i++) {
			System.out.print(name[i] + " 의 성적은 :");
			numK[i] = scanner.nextInt();
		}

		System.out.println("English의 성적을 입력 : ");
		for (int j = 0; j < numE.length; j++) {
			System.out.print(name[j] + " 의 성적은 :");
			numE[j] = scanner.nextInt();
		}

		System.out.println("Mathematics의 성적을 입력 : ");
		for (int k = 0; k < numM.length; k++) {
			System.out.print(name[k] + " 의 성적은 :");
			numM[k] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("\t" + "Korean" + "\t" + "\t" + "English" + "\t" + "\t" + "Mathematics" + "\t" + "Total"
				+ "\t" + "\t" + "Average" + "\t");
		for (int l = 0; l < name.length; l++) {
			total[l] = (numK[l] + numE[l] + numM[l]);
			aver[l] = (numK[l] + numE[l] + numM[l]) / 3;

			System.out.print(name[l] + "\t   " + numK[l] + "\t" + "\t  " + numE[l] + "\t" + "\t  " + numM[l] + "\t"
					+ "\t  " + total[l] + "\t" + "\t");

			System.out.println(aver[l] + "\t");

		}

	}

}
