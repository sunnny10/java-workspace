package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class UpdateMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = new ConnectionFactory().getConnection();
			conn.setAutoCommit(false); 	// 기본적으로 true로 설정되어 있다.
			
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 ID를 입력 : ");
			String id = sc.nextLine();
			System.out.print("수정할 이름을 입력 : ");
			String name = sc.nextLine();
			
//			String sql = "update t_test ";
//				   sql += "	set name = ? ";
//				   sql += " where id = ? ";	// 문자열은 상수니까, 변화가 자주 일어나는 문자열 일때는 String 클래스말고, Stringbuilder(동기할 때)나 Stringbuffer(비동기할 때) 사용해야 한다.
			
			StringBuilder sql = new StringBuilder();
			
			sql.append("update t_test ");
			sql.append("  set name = ? ");
			sql.append(" where id = ? ");
				   
			
			pstmt = conn.prepareStatement(sql.toString());	// 여기 파라미터는 무조건 String 이여야 한다.
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate();
			conn.commit();
			System.out.println(cnt + "행 수정완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
			
		}
	}

}
