package in.co.rays.bean;

public class LoginBean {
	private int id ;
	private String user_name;
	private String login_id;
	public int getId() {
		return id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
