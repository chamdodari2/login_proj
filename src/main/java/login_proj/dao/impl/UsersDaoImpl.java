package login_proj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login_proj.dao.UsersDao;
import login_proj.dto.Users;


public class UsersDaoImpl implements UsersDao {
	private static final UsersDaoImpl instance = new UsersDaoImpl();
	private Connection con;
	
	public static UsersDaoImpl getInstance() {
		return instance;
	}
	
	
	
	
	
	private UsersDaoImpl() {
	}


	public void setCon(Connection con) {
		this.con = con;
	}



	@Override
	public Users selectLoginUsers(Users user) {
		String sql = "select id "
				  +  "from users  "
				  +  "where id = ? "
				  +  "and passwd = password(?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, user.getId());  
			pstmt.setString(2, user.getPasswd());
			
			try(ResultSet rs =pstmt.executeQuery()){
				if(rs.next()) {
					return new Users(rs.getString("id"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
