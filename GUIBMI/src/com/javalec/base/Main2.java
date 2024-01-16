package com.javalec.base;

public class Main2 {

	public static void main(String[] args) {
		String str = "asfdae@naver.com";
		String str2 = str.substring(str.length()-4);
		String str3 = ".com";
		
//		if(!str2.equals(".com")) {
//			System.out.println(".com");
//		}else {
//			System.out.println("아닙니다");
//		}
		
		String email = "foewjah@@naver.com"; // 이메일 주소
		int atIndex = email.indexOf('@'+'@'); // '@' 문자의 인덱스를 찾음
		
		System.out.println(atIndex);
		if (atIndex != -1) {
		    char atSymbol = email.charAt(atIndex); // '@' 문자 추출
		    System.out.println("이메일에서 @ 문자: " + atSymbol);
		} else {
		    System.out.println("이메일 주소에서 @ 문자를 찾을 수 없습니다.");
		}
	}

}
