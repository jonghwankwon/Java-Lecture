package basic01;

import java.sql.*;

public class ConnectMain {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
					"javauser", "javapass");	// 데이터베이스와 연동

			st = conn.createStatement();
			String sql = "select * FROM song;";		//SQL 변수 생성
			ResultSet rs = st.executeQuery(sql);	
			while (rs.next()) {
				int songId = rs.getInt(1);		//DB는 (1)부터 / java는 [0]
				String title = rs.getString(2);
				String lyrics = rs.getString(3);
				System.out.printf("%8d %-20s\t%s\n", songId, title, lyrics);
			}

			String date = "select * FROM date_table;";		//SQL 변수 생성
			ResultSet dt = st.executeQuery(date);	
			while (dt.next()) {
				int Id = dt.getInt(1);		//DB는 (1)부터 / java는 [0]
				date = dt.getString(2);
				System.out.printf("%8d %s\n", Id, date);
			}

			dt.close();
			rs.close();
			st.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
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
