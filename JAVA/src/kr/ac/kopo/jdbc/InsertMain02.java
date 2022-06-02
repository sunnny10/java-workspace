package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 아이디 입력 : park
 * 이름 입력 : 박길동
 * 1개 행을 삽입하였습니다.
 */
public class InsertMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			// 2단계
			conn = DriverManager.getConnection(url, user, password);
//				System.out.println("conn : " + conn);
			
			// 3단계
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("이  름 : ");
			String name = sc.nextLine();
			
			String sql  = "insert into t_test(id, name) ";
				   sql += " values(\'" + id + "\', \'" + name + "\') ";
			
			stmt = conn.createStatement();
			
			// 4단계
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
		
}
