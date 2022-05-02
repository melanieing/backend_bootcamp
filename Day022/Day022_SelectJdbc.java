package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// SELECT "NUMBER", "NAME", "BIRTH", "BLOOD_TYPE" from "INFO";

public class Day022_SelectJdbc {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234");
			System.out.println("오라클 데이터베이스 접속 성공!");
			
			stmt = conn.createStatement();

			String sql = "SELECT \"NUMBER\", \"NAME\", \"BIRTH\", \"BLOOD_TYPE\" from \"INFO\"";
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql); // 쿼리 전송!
			while (rs.next()) {
				System.out.print(rs.getLong(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getDate(3) + "\t");
				System.out.println(rs.getString(4));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
