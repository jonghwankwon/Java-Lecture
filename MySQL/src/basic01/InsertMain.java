package basic01;

import java.sql.*;

public class InsertMain {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
					"javauser", "javapass");	// 데이터베이스와 연동
			//the mysql insert statement
			String query = "insert into song (title, lyrics) values (?, ?);";
			
			// create the mysql insert prepatedStatement
			PreparedStatement pStmt = conn.prepareStatement(query);
			pStmt.setString(1, "가시나");
			pStmt.setString(2, "선미");
			
			// execute the preparedStatement
			pStmt.executeUpdate();
			
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se2) { }
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
