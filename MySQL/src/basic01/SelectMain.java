package basic01;

import java.sql.*;

public class SelectMain {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
					"javauser", "javapass");	// 데이터베이스와 연동
			
/*			st = conn.createStatement();
			//int id = 110;
			String sql = "select * FROM song where title like 'Gee';";		//SQL 변수 생성
			ResultSet rs = st.executeQuery(sql);	
			while (rs.next()) {
				int songId = rs.getInt(1);		//DB는 (1)부터 / java는 [0]
				String title = rs.getString(2);
				String lyrics = rs.getString(3);
				System.out.printf("%8d %-20s\t%s\n", songId, title, lyrics);
			}*/
			
			int id = 110;
			String sql = "select * FROM song where _id=?;";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();	
			while (rs.next()) {
				int songId = rs.getInt(1);		//getInt("_id")
				String title = rs.getString(2);
				String lyrics = rs.getString(3);
				System.out.printf("%8d %-20s\t%s\n", songId, title, lyrics);
			}
			
			rs.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se2) { }
			try {
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}