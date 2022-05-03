package subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubjectDAO {

	private JdbcTemplate jdbcTemplate;
	
	public SubjectDAO() {
		jdbcTemplate = JdbcTemplate.getInstance();
	}
	
	// INSERT query
	public boolean insertSubject(SubjectVO vo) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기 
		
		String sql = "INSERT INTO \"SUBJECT\" VALUES (\"SQ_SUBJECT\".NEXTVAL, ?)";

		try {
			conn = jdbcTemplate.getConnection();
			
			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			pstmt.setString(1, vo.getsubName()); // 바인딩 파라미터에 값 설정

			System.out.println(sql);
			
			int result = pstmt.executeUpdate(); // 뤄리 전송!
			System.out.println(result + "행이 삽입되었습니다.");
			flag = true; // INSERT 성공 시 true 반환
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
			if (conn != null) {
				try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
		}
		return flag; // INSERT 실패 시 그대로 false 반환
	}
	
	// SELECT_ALL query 
	public List<SubjectVO> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		List<SubjectVO> list = new ArrayList<>();
		String sql = "SELECT \"SUB_CODE\", \"NAME\" FROM \"SUBJECT\"";
		
		try {
			conn = jdbcTemplate.getConnection();			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 쿼리 전송!
			while (rs.next()) {
				SubjectVO tmp = new SubjectVO(
						rs.getLong("SUB_CODE"), 
						rs.getString("NAME"));
				list.add(tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
			if (pstmt != null) {
				try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
			if (conn != null) {
				try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
		}
		return (list.size() == 0) ? null : list;
	}
	
	// SELECT_ONE query 
	public List<SubjectVO> searchByCode(int searchCode) {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		List<SubjectVO> list = new ArrayList<>();
		String sql = "SELECT \"SUB_CODE\", \"NAME\" FROM \"SUBJECT\" WHERE \"SUB_CODE\"=?";
		
		try {
			conn = jdbcTemplate.getConnection();			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, searchCode);
			rs = pstmt.executeQuery(); // 쿼리 전송!
			while (rs.next()) {
				SubjectVO tmp = new SubjectVO(
						rs.getLong("SUB_CODE"), 
						rs.getString("NAME"));
				list.add(tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
			if (pstmt != null) {
				try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
			if (conn != null) {
				try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
		}
		return (list.size() == 0) ? null : list;
	}
	
	
	// SELECT_ONE query 
		public List<SubjectVO> searchByName(String searchName) {
			Connection conn = null;
			PreparedStatement pstmt = null; 
			ResultSet rs = null;
			
			List<SubjectVO> list = new ArrayList<>();
			String sql = "SELECT \"SUB_CODE\", \"NAME\" FROM \"SUBJECT\" WHERE \"NAME\"=?";
			
			try {
				conn = jdbcTemplate.getConnection();			
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, searchName);
				rs = pstmt.executeQuery(); // 쿼리 전송!
				while (rs.next()) {
					SubjectVO tmp = new SubjectVO(
							rs.getLong("SUB_CODE"), 
							rs.getString("NAME"));
					list.add(tmp);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rs != null) {
					try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
				}
				if (pstmt != null) {
					try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
				}
				if (conn != null) {
					try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
				}
			}
			return (list.size() == 0) ? null : list;
		}
		
	// DELETE query
	public boolean deleteSubjectByCode(int subCode) {
		boolean flag = false;
		
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송결과 가져오기
		
		String sql = "DELETE FROM \"SUBJECT\" WHERE \"SUB_CODE\"=?";
		
		try {
			conn = jdbcTemplate.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, subCode);
			
			int result = pstmt.executeUpdate(); // 쿼리 전송!
			System.out.println(result + "행이 삭제되었습니다.");
			flag = true; // DELETE 성공 시 true 반환
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
			if (conn != null) {
				try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
		}
		return flag; // DELETE 실패 시 그대로 false 반환

	}
	
	// UPDATE query (NOT DONE)
		public boolean updateSubjectByName(String targetSubName, int newSubCode, String newSubName) {
			boolean flag = false;
			Connection conn = null;
			PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기 
			
			String sql = "UPDATE \"SUBJECT\" SET \"SUB_CODE\"=?, \"NAME\"=? WHERE \"NAME\"=?";
				
			try {
				conn = jdbcTemplate.getConnection();
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1,newSubCode);
				pstmt.setString(2, newSubName);
				pstmt.setString(3, targetSubName);
				
				int result = pstmt.executeUpdate(); // 쿼리 전송!
				System.out.println(result + "행이 수정되었습니다.");
				flag = true; // UPDATE 성공 시 true 반환
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (pstmt != null) {
					try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
				}
				if (conn != null) {
					try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
				}
			}
			return flag; // UPDATE 실패 시 그대로 false 반환
		}
}
