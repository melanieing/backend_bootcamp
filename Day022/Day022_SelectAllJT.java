package ojdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// SELECT "NUMBER", "NAME", "BIRTH", "BLOOD_TYPE" from "INFO";

public class Day022_SelectAllJT {
	public static void main(String[] args) {
		
		JdbcTemplate jt = JdbcTemplate.getInstance();
		
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		
		try {
			conn = jt.getConnection();
			System.out.println("드라이버 로딩 + 오라클 DB 접속 성공!");
			
			stmt = conn.createStatement();

			String sql = "SELECT \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" from \"INFO\"";
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql); // 쿼리 전송!
			while (rs.next()) {
//				System.out.print(rs.getLong(1) + "\t");
//				System.out.print(rs.getString(2) + "\t");
//				System.out.print(rs.getDate(3) + "\t");
//				System.out.println(rs.getString(4));
				
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
			if (stmt != null) {
				try {
					stmt.close();
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
