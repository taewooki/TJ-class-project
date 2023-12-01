package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATA출력
		System.out.println("abcd");
		System.out.println("1234");
		System.out.println("대한민국");
		
		
		//변수(Variable)
		// - 정수 int mum1 int는 정수로 등록할때 한번
		int num1 = 10 ;
		System.out.println(num1);
		num1 = 100;
		System.out.println(num1);
		
		
				
		int firstNumber = 10; //첫번째 숫자
	    int secondNumber = 20; //두번째 숫자
	   
	    //덧샘
	    System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber+secondNumber));
	    //뺄셈
	    System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber-secondNumber));
	    //곱셈
	    System.out.println(firstNumber + "x" + secondNumber + "=" + (firstNumber*secondNumber));
	    //나눗셈
	    System.out.println(firstNumber + "/" + secondNumber + "=" + ((double)firstNumber/secondNumber));
		
	    // 변수 작명
	    /*
	     * 변수는 의미 전달
	     	1) camel : 2단어의 연결중 첫번째 단어는 소문자로 시작하고 두번째 단어는 대문자로 시작
	     		ex) appleFruit, fistNumber
	     		사용: 변수이름, Method 이름
     		2) pascal : 2단어의 연결중 첫번째 단어는 대문자로 시작하고 두번째 단어도 대문자로 시작	
     			ex) AppleFuit, FirstNumber
     			사용 : Class 이름
 			3) snake : 2단어의 연결을 under bar로 한다.
 			ex) apple_fruit, first_number
 			사용: 변수이름, Method 이름
	     */
	    
	    // 상수(Constant)
	    final double pi = 3.141592;
	    System.out.println(pi);
	   
	    
	    int intNum1 = 20;
	    int intNum2 = 10;
	    int intNum3 = intNum1 + intNum2;
	    char char1 = '가';
	    String str1 = "다나다아아아아";
	    double doubleNum =10;
	    
	    boolean boolNum1 = true;
	    boolNum1 = false;
	    
	    doubleNum = intNum3;
	    intNum3 = (int)doubleNum;
	    
	    
	    		
	    
	    
	}

}
