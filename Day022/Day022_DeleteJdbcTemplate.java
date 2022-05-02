package ojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DELETE FROM "INFO" WHERE "NUMBER"=12;

public class Day022_DeleteJdbcTemplate {
	public static void main(String[] args) {
		
		JdbcTemplate jt = JdbcTemplate.getInstance();
		
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송결과 가져오기
		
		String sql = "DELETE FROM \"INFO\" WHERE \"NUMBER\"=?";
		long number = 11;
		
		try {
			conn = jt.getConnection();
			System.out.println("드라이버 로딩 + 오라클 DB 접속 성공!");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, number);
			
			int result = pstmt.executeUpdate(sql); // 쿼리 전송!
			System.out.println(result + "행이 삭제되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
