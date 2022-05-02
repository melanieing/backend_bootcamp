package ojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

//INSERT INTO "INFO" VALUES ("SQ_INFO".NEXTVAL, 'Amanda', '1998-12-19', 'B');

public class Day022_InsertJdbcTemplate {
	public static void main(String[] args) {
		JdbcTemplate jt = JdbcTemplate.getInstance();
		
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기 
		
		String name = "Amanda";
		// Date birthDate = Date.valueOf(LocalDate.parse("1998-12-19"));
		LocalDate birth = LocalDate.parse("1998-12-19");
		String bloodType = "B";
		String sql = "INSERT INTO \"INFO\" VALUES (\"SQ_INFO\".NEXTVAL, ?, ?, ?)";

		try {
			conn = jt.getConnection();
			System.out.println("드라이버 로딩 + 오라클 DB 접속 성공!");
			
			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			pstmt.setString(1,  name);
			pstmt.setObject(2, birth);
			pstmt.setString(3,  bloodType);
			
			int result = pstmt.executeUpdate(); // 뤄리 전송!
			System.out.println(result + "행이 삽입되었습니다.");
			
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
