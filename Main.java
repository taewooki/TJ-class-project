package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1에서 100까지의 수중 10인 경우를 찾기!
//		for(int i=1; i<=100; i++) {
//			if(i == 10) {
//				System.out.println("Find 10");
//				break;
//			}
//		}

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}
}
