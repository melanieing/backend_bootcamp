package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// UPDATE "INFO" SET "NAME"='Karin' WHERE "NUMBER"=1;

public class Day022_UpdateJdbc {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null; 
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##tester", "1234");
			System.out.println("오라클 데이터베이스 접속 성공!");
			
			stmt = conn.createStatement();
			
			String name = "Karin";

			String sql = "UPDATE \"INFO\" SET \"NAME\"='"+name+"' WHERE \"NUMBER\"=1";
			System.out.println(sql);
			
			int result = stmt.executeUpdate(sql); // 쿼리 전송!
			System.out.println(result + "행이 수정되었습니다.");
			
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
