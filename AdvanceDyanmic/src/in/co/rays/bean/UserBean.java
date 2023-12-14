package in.co.rays.bean;

import java.util.Date;

public class UserBean {
	 private int Id;
	 private String First_name;
	 private String Last_Name;
	 private String Login_Id;
	 private String Password;
	 private Date Dob;
	 private String Address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getLogin_Id() {
		return Login_Id;
	}
	public void setLogin_Id(String login_Id) {
		Login_Id = login_Id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}


