package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1 부터 100까지 합계 구하기
		
		// for(int i=1; i<=100; i++ ) {
			
	//	}
		int i =1 ;
		int tot = 0;
		
	//	while(i <= 100) {
	//		System.out.println(i);
	//		i++;
	//	}
		while(true) {
		//	System.out.println(i);
			tot += i;
			i++;
			if(i>100) {
				break;
			}
		}
		System.out.println(tot);
		
		
	}

}
