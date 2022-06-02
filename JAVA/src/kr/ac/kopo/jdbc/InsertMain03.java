package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);
			
			String id = "kim";
			String name = "김길동";
			
			String sql = "insert into t_test(id, name) ";
				   sql += " values(?,?)";
				   
		    pstmt = conn.prepareStatement(sql);	// like가 잘 안먹힘
		    pstmt.setString(1, id);	// db는 1부터 시작, 내부적으로 String이면 알아서 작은 따옴표가 들어감
		    pstmt.setString(2, name);
		    
		    int cnt = pstmt.executeUpdate();
		    System.out.println(cnt + "개 행이 삽입되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
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
