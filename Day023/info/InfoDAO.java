package info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InfoDAO {

	private JdbcTemplate jdbcTemplate;
	
	public InfoDAO() {
		jdbcTemplate = JdbcTemplate.getInstance();
	}
	
	// INSERT query
	public boolean insertInfo(InfoVO vo) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기 
		
		String sql = "INSERT INTO \"INFO\" VALUES (\"SQ_INFO\".NEXTVAL, ?, ?, ?)";

		try {
			conn = jdbcTemplate.getConnection();
			
			pstmt = conn.prepareStatement(sql); // 쿼리 템플릿 준비
			pstmt.setString(1,  vo.getName()); // 바인딩 파라미터에 값 설정
			pstmt.setObject(2, vo.getBirth());
			pstmt.setString(3,  vo.getBloodType());
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
	public List<InfoVO> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		List<InfoVO> list = new ArrayList<>();
		String sql = "SELECT \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" FROM \"INFO\"";
		
		try {
			conn = jdbcTemplate.getConnection();			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 쿼리 전송!
			while (rs.next()) {
				InfoVO tmp = new InfoVO(
						rs.getLong("NUMBER"), 
						rs.getString("NAME"), 
						rs.getDate("BIRTH").toLocalDate(), 
						rs.getString("BLOOD_TYPE"));
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
	public List<InfoVO> searchByNum(int targetNum) {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		List<InfoVO> list = new ArrayList<>();
		String sql = "SELECT \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" FROM \"INFO\" WHERE \"NUMBER\"=?";
		
		try {
			conn = jdbcTemplate.getConnection();			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, targetNum);
			rs = pstmt.executeQuery(); // 쿼리 전송!
			while (rs.next()) {
				InfoVO tmp = new InfoVO(
						rs.getLong("NUMBER"), 
						rs.getString("NAME"), 
						rs.getDate("BIRTH").toLocalDate(), 
						rs.getString("BLOOD_TYPE"));
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
	public boolean deleteInfoByNum(int targetInfoNum) {
		boolean flag = false;
		
		Connection conn = null;
		PreparedStatement pstmt = null; // 쿼리 전송결과 가져오기
		
		String sql = "DELETE FROM \"INFO\" WHERE \"NUMBER\"=?";
		
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
	
	// UPDATE query (NOT DONE)
		public boolean updateInfoByName(String targetName, int newNum, LocalDate newBirth, String newBloodType) {
			boolean flag = false;
			Connection conn = null;
			PreparedStatement pstmt = null; // 쿼리 전송 결과 가져오기 
			
			String sql = "UPDATE \"INFO\" SET \"NUMBER\"=?, \"BIRTH\"=?, \"BLOOD_TYPE\"=? WHERE \"NAME\"=?";
				
			try {
				conn = jdbcTemplate.getConnection();
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1,newNum);
				pstmt.setObject(2, newBirth);
				pstmt.setString(3, newBloodType);
				pstmt.setString(4, targetName);
				
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
