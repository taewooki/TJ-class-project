package com.javalec.function;

public class ShareVar {
	
	// share이기 때문에 final을 안써도 무관하나 정 불안하다면 final 붙여도 된다.
	public static String dbName = "jdbc:mysql://127.0.0.1:3300/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	
	public static String dbUser = "root";
	
	public static String dbPass = "qwer1234";
	
	public static int filename = 0;
	
	
	
}
