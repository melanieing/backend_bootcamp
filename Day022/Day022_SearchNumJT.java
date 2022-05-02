package ojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// SELECT "NUMBER", "NAME", "BIRTH", "BLOOD_TYPE" from "INFO" WHERE "NUMBER"=7;

public class Day022_SearchNumJT {
	public static void main(String[] args) {
		
		JdbcTemplate jt = JdbcTemplate.getInstance();
		
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		String sql = "SELECT \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" from \"INFO\" WHERE \"NUMBER\"=?";
		long number = 7;
		
		try {
			conn = jt.getConnection();
			System.out.println("드라이버 로딩 + 오라클 DB 접속 성공!");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1,  number);
			
			rs = pstmt.executeQuery(); // 쿼리 전송!
			if (rs.next()) { // 값 1개만 가져올 때는 이렇게 if절로 구현
				System.out.print(rs.getString("NAME") + "\t");
				System.out.print(rs.getDate("BIRTH") + "\t");
				System.out.print(rs.getLong("NUMBER") + "\t");
				System.out.println(rs.getString("BLOOD_TYPE"));
			} else {
				System.out.println("검색된 정보가 없습니다.");
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
