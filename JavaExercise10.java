package come.javalec;

import java.util.Scanner;

public class JavaExercise10 {

	public static void main(String[] args) {

		// 10번
		// 10개의 점수(0점 부터 99점)를 입력받아 점수의 분포를 10점 간격의 등급으로된 히스토 그램을 표시하라.

		int[] num = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input score :");
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "의 score :");
			int kk = scanner.nextInt(); // 입력값의 변수 계산.
			num[kk / 10]++; // 나눗셈.
		}
		scanner.close();

		System.out.println("--------Histogram--------");

		for (int i = (num.length - 1); i >= 0; i--) {
			System.out.print(String.format("%3d : ", i * 10));// %3d 세자리 십진법으로 출력
			for (int j = 1; j <= num[i]; j++) { // num[i]가 1부터 시작 j는 맞추어줌.
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
