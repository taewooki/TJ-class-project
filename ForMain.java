package com.javalec.base;

public class ForMain {

	public static void main(String[] args) {
		// 반복문
		
//	for (int i=1; i<=10; i++) { // i=1이 시작, i++ 1만큼 증가(i=2 만큼 중,i<=10인걸 물어
//		System.out.println(i); 
		// 컴퓨터가 반복문을 좋아
//	}
//	{
		// 1부터 10까지의 함계
//	int tot = 0; // 누적함
//  for (int i=1; i<=10; i++) {
//	tot+=i;		
//	System.out.println(tot);
//	}
	
	// 1 부터 100까지의 홀수의 합과 짝수의 합 구하기
		int oddTot = 0;
		int second = 0;
		for(int i=1; i <=100; i++) {
			if(i % 2 == 1) {
				oddTot += i;
			} else {        // 선생님 코딩
				second += i; // 선생님 코딩
			}
		}
		System.out.println("홀수의 합 : " + oddTot);
		
	//	for(int i=1; i <=100; i++) {
	//		if(i % 2 == 0) {
	//			second += i;
	//		}
	//	}
	 System.out.println("짝수의 합 : " + second);
	}

}
