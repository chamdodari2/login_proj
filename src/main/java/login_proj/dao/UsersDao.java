package login_proj.dao;

import login_proj.dto.Users;

public interface UsersDao {
	
	
	Users selectLoginUsers(Users user);

}
