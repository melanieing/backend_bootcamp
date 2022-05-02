package ojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// UPDATE "INFO" SET "NAME"='Karina' WHERE "NUMBER"=1;

public class Day022_UpdateJdbcTemplate {
	public static void main(String[] args) {
		JdbcTemplate jt = JdbcTemplate.getInstance();
		
		
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기 
		
		String name = "Karin";
		long number = 14;
		String sql = "UPDATE \"INFO\" SET \"NAME\"=? WHERE \"NUMBER\"=?";
		
		try {
			conn = jt.getConnection();
			System.out.println("드라이버 로딩 + 오라클 DB 접속 성공!");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setLong(2, number);
			
			int result = pstmt.executeUpdate(); // 쿼리 전송!
			System.out.println(result + "행이 수정되었습니다.");
			
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
