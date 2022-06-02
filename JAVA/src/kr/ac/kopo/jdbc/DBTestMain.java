package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 	작업순서
 	1. 드라이버 로딩
 	2. DB 접속 및 연결객체 얻어오기
 */
public class DBTestMain {
	public static void main(String[] args) {
		try {		
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");	// 에러 나는 이유는 db가 외부 장치(다른 하드장치에 저장되어있음), 외부장치에 db가 없을 수도 있기 때문에 db 접근하는 것은 다 예외 처리해야함.
			System.out.println("드라이버 로딩 완료...");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.119.119:1521:dink", "scott", "tiger");	// 커넥션 객체 리턴함
			System.out.println("DB접속 성공 : " + conn);	// 자바와 db 간 통로가 만들어진 것. 이거는 다 IO
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
