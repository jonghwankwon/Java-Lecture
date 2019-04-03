package Practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	public MemberDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//가입
	public void insertMember(MemberDTO member) {
		String query = "insert into Member  values (?, ?, ?, ?, ? );";	//(passwd, name, birthday, address)
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, member.getId());
			pStmt.setString(2, member.getPasswd());
			pStmt.setString(3, member.getName());
			pStmt.setString(4, member.getBirthday());
			pStmt.setString(5, member.getAddress());

			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}	
	}

	//조회
	public MemberDTO selectOne(int id) {
		String query = "select * from member where id=?;";
		PreparedStatement pStmt = null;
		MemberDTO member = new MemberDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				member.setId(rs.getInt(1));
				member.setPasswd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setBirthday(rs.getString(4));
				member.setAddress(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return member;
	}

	//변경
	public void updateMember(MemberDTO member) {
		String query = "update member set passwd=?, name=?, birthday=?, address=?  where id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			
			pStmt.setString(1, member.getPasswd());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getBirthday());
			pStmt.setString(4, member.getAddress());
			pStmt.setInt(5, member.getId());

			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	//삭제
	public void deleteMember(int id) {
    	String query = "delete from Member where id=?;";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}	
    }

	//검색
	public List<MemberDTO> selectAll() {
    	String sql = "select * from member order by desc;";
    	List<MemberDTO> memberList = selectCondition(sql);
    	return memberList;
    }
	
	public List<MemberDTO> selectMembersById(int id) {
    	String sql = "select * from Member where id like '" + id + "';";
    	List<MemberDTO> memberList = selectCondition(sql);
    	return memberList;
    }
	
	public List<MemberDTO> selectMembersByName(String name) {
    	String sql = "select * from Member where name like '" + name + "';";
    	List<MemberDTO> memberList = selectCondition(sql);
    	return memberList;
    }

	public List<MemberDTO> selectMembersByBrithday(String birthday) {
    	String sql = "select * from Member where birthday like '" + birthday + "';";
    	List<MemberDTO> memberList = selectCondition(sql);
    	return memberList;
    }

	public List<MemberDTO> selectMembersByAddress(String address) {
		String sql = "select * from Member where address like '" + address + "';";
		List<MemberDTO> memberList = selectCondition(sql);
		return memberList;
	}
	
	public List<MemberDTO> selectCondition(String query) {
    	PreparedStatement pStmt = null;
    	List<MemberDTO> memberList = new ArrayList<MemberDTO>();
    	try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setId(rs.getInt(1));
				member.setPasswd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setBirthday(rs.getString(4));
				member.setAddress(rs.getString(5));
				memberList.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
    	return memberList;
    }
	
	public void close() {
		try {
			if (conn != null && !conn.isClosed()) 
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
