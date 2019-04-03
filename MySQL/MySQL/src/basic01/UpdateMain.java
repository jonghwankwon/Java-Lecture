package basic01;

import java.sql.*;

public class UpdateMain {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
					"javauser", "javapass");	// 데이터베이스와 연동
			//the mysql update statement
			String query = "update song set lyrics=? where _id=?";
			
			// create the mysql update prepatedStatement
			PreparedStatement pStmt = conn.prepareStatement(query);
			pStmt.setString(1, "왜 예쁜 날 두고 가시나 (날 두고 가시나)");
			pStmt.setInt(2, 117);
			
			// execute the preparedStatement
			pStmt.executeUpdate();
			
			conn.close();
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

