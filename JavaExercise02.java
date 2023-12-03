package come.javalec;

public class JavaExercise02 {

	public static void main(String[] args) {
		// 2번
		// 10의 10의 0승에서 ~ 10의 10승까지의 제곱승을 구하라.
			
		for (long i = 0, num = 1; i <= 10;i++) {
			num *=10; // 10을 재곱해준다.
			System.out.println("10^" + String.format("%2d", i) + " =" + String.format("%13d", num));
		}
	}
}
