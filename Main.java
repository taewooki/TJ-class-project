package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//문자 비교
		
		Scanner scanner = new Scanner(System.in);  // 2번째 화면
		String id = "";
		String password = "";
		
		String realId = "root";
		String realPassword = "1234";
		
		
		
		System.out.println("** Log In Check **");  // 1번째 화면
		
		System.out.println("ID를 입력하세요. :");    // 1번째 화면
		id = scanner.next();
		System.out.println("Password를 입력하세요 :");
		password = scanner.next();
		
		if(realId.equals(id) && realPassword.equals(password)) {
			System.out.println("환영 합니다!");
		} else {
			System.out.println("ID나 Password를 확인하세요!");
		}
		

	}

}
