package com.hanul.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {	//DB연동하여 트랜잭션(요청)을 처리
	private Connection conn;		//연결객체
	private PreparedStatement ps;	//전송객체
	private ResultSet rs;			//결과객체
	
	//DB접속 : ojdbc8.jar(C:\oracle18c\dbhomeXE\jdbc\lib) ▶ WebContent > WEB-INF > lib : 복붙(등록)
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hanul";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn() Exception!!");
		}
		return conn;
	}//getConn()
	
	//DB접속 해제
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
		e.printStackTrace();
		System.out.println("dbClose() Exception!!");
		}
	}//dbClose()
	
	//회원가입
	public int insertMember(MemberDTO dto) {
		conn = getConn();		//DB접속
		String sql = "insert into Member values (?, ?, ?, ?, ?, ?)";		//SQL문장 작성
		int succ = 0;			//성공여부를 판단할 변수를 초기화
		try {
			ps = conn.prepareStatement(sql);	//전송객체
			ps.setString(1, dto.getName());		//매개변수 값을 할당(세팅)
			ps.setString(2, dto.getId());		
			ps.setString(3, dto.getPw());
			ps.setInt(4, dto.getAge());
			ps.setString(5, dto.getAddr());
			ps.setString(6, dto.getTel());
			succ = ps.executeUpdate();			//SQL문장 실행
		} catch (Exception e) {	//예외처리
			e.printStackTrace();
			System.out.println("insertMember() Exception!!");
		} finally {
			dbClose();			//DB접속 해제
		}
		return succ;			//결과를 리턴
	}//insertMember
	
	
	
	
	
	
	
	

}//class
