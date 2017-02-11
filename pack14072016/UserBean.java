package pack14072016;

public class UserBean {

	private String userName;
	private String password;
	
	public UserBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public UserBean() {
		super();
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}