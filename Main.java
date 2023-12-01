package com.javalec.base;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자가 입력하는 숫자 5개를 받아서 합계

		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		// int num1;
		// int num2;
		int total = 0;
		int max = -2147000000;
		int min =  2147000000; 

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번 숫자를 입력하세요 :");
			num[i] = scanner.nextInt();

		}

		// System.out.println("1번 숫자를 입력하세요 : ");
		// num1 = scanner.nextInt();
		// System.out.println("2번 숫자를 입력하세요 : ");
		// num2 = scanner.nextInt();

		for (int i = 0; i < num.length; i++) {
			total += num[i];
			max = Math.max(max,num[i]);
			min = Math.min(min,num[i]);
			
		
		
		}
		System.out.println("Total :" + total);
		System.out.println("Average : "+ (double)total/num.length);
		System.out.println("Max num : "+ max);
		System.out.println("Min num : "+ min);

	}

}
