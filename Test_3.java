package com.javalec.base;

import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int num1 = 0, firstNum = 0;
	int num2 = 0, secondNum = 0;
	int num3 = 0;
	double tot =0 ;
	int totCount = 0;
	int max = 0; //최대값
	int min = 0; //최소값
	
	

		
	System.out.print("1. 시작하는 숫자를 정하세요 : ");
	num1 = scanner.nextInt();
	System.out.print("2. 범위의 끝 숫자를 정하세요 : ");
	num2 = scanner.nextInt();
	System.out.print("3. 원하는 배수는 ?  ");
	num3 = scanner.nextInt();
	
	// 수식, 입력 숫자 정의
	if(num1>num2) {
		firstNum = num2;
		secondNum = num1;
	}else {
		firstNum = num1;
		secondNum = num2;
	}
	
	// 수식
	
	//System.out.println(firstNum);
	//System.out.println(secondNum);
	
	 for(int i=firstNum; i<= secondNum; i += num3) { // 수식을 +=로 넣어야 하고 num3만 넣었
		tot +=i;
		totCount ++;
									
		if (max<i ) {
				max=i;
			}
			
	 	    if (min>i && min>0) {
	 	    	min=i ;
	 	    }
		    
	 	
		// if ( i>max ) {
		//	 max=i;			 
		
	 }
	 	 
	 System.out.println(firstNum + "부터 "+secondNum+"의 범위 중" +num3+ "의 배수의 숫자의 갯수는 " +totCount+ "개이고 합은 " +tot+ " 입니다.");
	 System.out.println(firstNum+ "의 배우싀 평균은 "+ (tot/totCount)+ "이고,");
	 System.out.println(firstNum +"의 배수의 숫자중 최대 숫자는 " + max + "이고 최소 숫자는 "+ min + "입니다.");
	 
	 // 최소값 못구
	}
		
	

} 
		
	
	
	
	
	
	
	//System.out.println("결과");
	//System.out.println(tot);
	
	//System.out.println(firstNum + " 부터 " +secondNum + "의 범위중 "+ firstNum+ " 의 배수의 숮자의 갯수는"+ totCount +"개이고 합은 " + tot +" 입니다.");
	
	
	
