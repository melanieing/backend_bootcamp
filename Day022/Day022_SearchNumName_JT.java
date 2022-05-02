package ojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// SELECT "NUMBER", "NAME", "BIRTH", "BLOOD_TYPE" from "INFO" WHERE "NUMBER"=7 OR "NAME"='Winter';

public class Day022_SearchNumName_JT {
	public static void main(String[] args) {
		
		JdbcTemplate jt = JdbcTemplate.getInstance();
		
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		String sql = "SELECT \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" from \"INFO\" WHERE \"NUMBER\"=? OR \"NAME\"=?";
		long number = 7;
		String name = "Winter";
		
		try {
			conn = jt.getConnection();
			System.out.println("드라이버 로딩 + 오라클 DB 접속 성공!");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1,  number);
			pstmt.setString(2, name);
			
			rs = pstmt.executeQuery(); // 쿼리 전송!
			
			while (rs.next()) { // 값이 여러 개일 수 있기 때문에 while문 돌리기
				System.out.print(rs.getString("NAME") + "\t");
				System.out.print(rs.getDate("BIRTH") + "\t");
				System.out.print(rs.getLong("NUMBER") + "\t");
				System.out.println(rs.getString("BLOOD_TYPE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
