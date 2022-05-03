package score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAO {

	private JdbcTemplate jdbcTemplate;
	
	public ScoreDAO() {
		jdbcTemplate = JdbcTemplate.getInstance();
	}
	
	// INSERT query
	public boolean insertScore(ScoreVO vo) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기 
		
		String sql = "INSERT INTO \"SCORE\" VALUES (\"SEQ_SCORE\".NEXTVAL, ?, ?, ?)";

		try {
			conn = jdbcTemplate.getConnection();
			
			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			pstmt.setLong(1,  vo.getInfoNum()); // 바인딩 파라미터에 값 설정
			pstmt.setLong(2, vo.getSubCode());
			pstmt.setDouble(3,  vo.getSubScore());
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
	public List<ScoreVO> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		List<ScoreVO> list = new ArrayList<>();
		String sql = "SELECT \"NUMBER\", \"INFO_NUMBER\", \"SUBJECT_CODE\", \"SUBJECT_SCORE\" FROM \"SCORE\"";
		
		try {
			conn = jdbcTemplate.getConnection();			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 쿼리 전송!
			while (rs.next()) {
				ScoreVO tmp = new ScoreVO(
						rs.getLong("NUMBER"), 
						rs.getLong("INFO_NUMBER"), 
						rs.getLong("SUBJECT_CODE"),
						rs.getDouble("SUBJECT_SCORE"));
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
	public List<ScoreVO> searchByInfoNum(long targetInfoNum) {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		List<ScoreVO> list = new ArrayList<>();
		String sql = "SELECT \"NUMBER\", \"INFO_NUMBER\", \"SUBJECT_CODE\", \"SUBJECT_SCORE\" FROM \"SCORE\" WHERE \"INFO_NUMBER\"=?";
		
		try {
			conn = jdbcTemplate.getConnection();			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, targetInfoNum);
			rs = pstmt.executeQuery(); // 쿼리 전송!
			while (rs.next()) {
				ScoreVO tmp = new ScoreVO(
						rs.getLong("NUMBER"), 
						rs.getLong("INFO_NUMBER"), 
						rs.getLong("SUBJECT_CODE"),
						rs.getDouble("SUBJECT_SCORE"));
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
	public List<ScoreVO> searchBySubjectCode(long targetSubCode) {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		List<ScoreVO> list = new ArrayList<>();
		String sql = "SELECT \"NUMBER\", \"INFO_NUMBER\", \"SUBJECT_CODE\", \"SUBJECT_SCORE\" FROM \"SCORE\" WHERE \"SUBJECT_CODE\"=?";
		
		try {
			conn = jdbcTemplate.getConnection();			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, targetSubCode);
			rs = pstmt.executeQuery(); // 쿼리 전송!
			while (rs.next()) {
				ScoreVO tmp = new ScoreVO(
						rs.getLong("NUMBER"), 
						rs.getLong("INFO_NUMBER"), 
						rs.getLong("SUBJECT_CODE"),
						rs.getDouble("SUBJECT_SCORE"));
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
	public boolean deleteScoreByInfoNum(long targetInfoNum) {
		boolean flag = false;
		
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송결과 가져오기
		
		String sql = "DELETE FROM \"SCORE\" WHERE \"INFO_NUMBER\"=?";
		
		try {
			conn = jdbcTemplate.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, targetInfoNum);
			
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
	
	// UPDATE query
		public boolean updateScoreByInfoNum(long upInfoNum, long upSubCode, double newSubScore) {
			boolean flag = false;
			Connection conn = null;
			PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기 
			
			String sql = "UPDATE \"SCORE\" SET \"SUBJECT_SCORE\"=?  WHERE \"INFO_NUMBER\"=? AND \"SUBJECT_CODE\"=?";
				
			try {
				conn = jdbcTemplate.getConnection();
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setDouble(1,newSubScore);
				pstmt.setLong(2, upInfoNum);
				pstmt.setLong(3, upSubCode);
				
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
