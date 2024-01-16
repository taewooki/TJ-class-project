package com.javalec.function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Dao {
	
	// Field
	private final String url_mysql = ShareVar.dbName;
	private final String id_mysql = ShareVar.dbUser;
	private final String pw_mysql = ShareVar.dbPass;
	
	int seqno;
	String name;
	String telno;
	String address;
	String email;
	String relation;
	FileInputStream file;
	
	
	//--------------------------------------------------------------------------------------------------------------------------------
	
	// Constructor
	public Dao() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Dao(int seqno) {
		super();
		this.seqno = seqno;
	}
	
	
	public Dao(String name, String telno, String address, String email, String relation, FileInputStream file) {
		super();
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
		this.file = file;
	}
	
	
	public Dao(int seqno, String name, String telno, String address, String email, String relation) {
		super();
		this.seqno = seqno;
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
	}
	
	
	//--------------------------------------------------------------------------------------------------------------------------------
	
	// Method
	
	// 검색 결과를 Talbe로 보내자.
	public ArrayList<Dto> selectList() {
		
		ArrayList<Dto> dtoList = new ArrayList<Dto>();
		String whereDefault = "select seqno, name, telno, relation from userinfo";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault);
			
			while(rs.next()) {
				int wkSeq = rs.getInt(1);			// whereDefault에 지정된 문자열의 첫 번째 순서
				String wkName = rs.getString(2);	// whereDefault에 지정된 문자열의 두 번째 순서
				String wkTelno = rs.getString(3);	// whereDefault에 지정된 문자열의 세 번째 순서
				String wkRelation = rs.getString(4);// whereDefault에 지정된 문자열의 네 번째 순서
				
				Dto dto = new Dto(wkSeq, wkName, wkTelno, wkRelation);
				dtoList.add(dto);
				
			}
			conn_mysql.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dtoList;
		
		
	}
	
	
	// Table을 Click 하였을 경우
	public Dto tableClick() {
		
		Dto dto = null;
		
		String where1 = "select seqno, name, telno, address, email, relation, file from userinfo";	// Column명을 * 처리 안하는 이유? : 순서가 달라질 수 있기 때문에...
		String where2 = " where seqno = " + seqno;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(where1 + where2);
			
			if(rs.next()) {
				int wkSeq = rs.getInt(1);			// whereDefault에 지정된 문자열의 첫 번째 순서
				String wkName = rs.getString(2);	// whereDefault에 지정된 문자열의 두 번째 순서
				String wkTelno = rs.getString(3);	// whereDefault에 지정된 문자열의 세 번째 순서
				String wkAddress = rs.getString(4);	// whereDefault에 지정된 문자열의 네 번째 순서
				String wkEmail = rs.getString(5);	// whereDefault에 지정된 문자열의 다섯 번째 순서
				String wkRelation = rs.getString(6);// whereDefault에 지정된 문자열의 여섯 번째 순서
				
				
				// file
				ShareVar.filename = ShareVar.filename + 1;
				
				File file = new File(Integer.toString(ShareVar.filename));
				FileOutputStream output = new FileOutputStream(file);	// 출력하는 file
				InputStream input = rs.getBinaryStream(7);
				byte[] buffer = new byte[1024];	// file이 잘라지는 크기
				
				while(input.read(buffer) > 0) {
					output.write(buffer);
				}
				
				
				dto = new Dto(wkSeq, wkName, wkTelno, wkAddress, wkEmail, wkRelation);
				
			}
			conn_mysql.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dto;
		
		
	}
	
	
	// 입력
	public boolean insertAction() {

		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String A = "insert into userinfo (name, telno, address, email, relation, file";
			String B = ") values (?,?,?,?,?,?)";
			
			ps = conn_mysql.prepareStatement(A+B);
			ps.setString(1, name);
			ps.setString(2, telno);
			ps.setString(3, address);
			ps.setString(4, email);
			ps.setString(5, relation);
			ps.setBinaryStream(6, file);
			ps.executeUpdate();
				
			conn_mysql.close();
			
		}catch(Exception e) {
			return false;
		}
		
		return true;
		
		
	}
	
	
	// 수정
	public boolean updateAction() {
		
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String A = "update userinfo set name = ?, telno = ?, address = ?, email = ?, relation = ?";
			String B = " where seqno = ?";
			
			ps = conn_mysql.prepareStatement(A+B);
			ps.setString(1, name);
			ps.setString(2, telno);
			ps.setString(3, address);
			ps.setString(4, email);
			ps.setString(5, relation);
			ps.setInt(6, seqno);
			ps.executeUpdate();
			
			conn_mysql.close();
			
		}catch(Exception e) {
			return false;
		}
		
		return true;
		
		
	}
	
	
	// 삭제
	public boolean deleteAction() {
		
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String A = "delete from userinfo where seqno = ?";
			
			ps = conn_mysql.prepareStatement(A);
			ps.setInt(1, seqno);
			ps.executeUpdate();
			
			conn_mysql.close();
			
		}catch(Exception e) {
			return false;
		}
		
		return true;
		
		
	}
	
	
	
}
