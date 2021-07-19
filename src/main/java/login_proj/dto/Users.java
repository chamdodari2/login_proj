package login_proj.dto;

public class Users {
	private int uid;
	private String id;
	private String passwd; 
	private String email;
	
	public Users() {
		
	}

	

	public Users(String id) {
		super();
		this.id = id;
	}



	public Users(String id, String passwd) {
		super();
		this.id = id;
		this.passwd = passwd;
	}



	public Users(int uid, String id, String passwd, String email) {
		super();
		this.uid = uid;
		this.id = id;
		this.passwd = passwd;
		this.email = email;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("UsersDto [uid=%s, id=%s, passwd=%s, email=%s]", uid, id, passwd, email);
	}
	
	
	

	

	

}
