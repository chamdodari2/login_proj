package login_proj.service;

import java.sql.Connection;

import login_proj.dao.impl.UsersDaoImpl;
import login_proj.ds.JndiDS;
import login_proj.dto.Users;

public class LoginService {
	UsersDaoImpl dao = UsersDaoImpl.getInstance();
	Connection con = JndiDS.getConnection();
	
	public LoginService() {
	dao.setCon(con);	
	}
	
	
	public Users getLoginUser(String id, String passwd) {
		Users user = new Users(id,passwd);
		Users loginUser = dao.selectLoginUsers(user);
		return loginUser;
		
	}

}
