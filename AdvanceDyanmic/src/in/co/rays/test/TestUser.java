package in.co.rays.test;

import java.sql.Date;
import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {
	public static void main(String[] args)throws Exception {
		testadd();
	}

	
		private static void testadd()throws Exception {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		



		UserBean bean = new UserBean();
		bean.setId(2024);
		bean.setFristName("abhishek");
		bean.setLastName("parmar");
		bean.setDob(sdf.parse("2023-12-1"));
	    bean.setLogin_id("parmarAbhishek15@gmail.com");
	    bean.setPassword("31278");
	    bean.setAddress("123d indore");
		
		UserModel Model = new UserModel(); 
		Model.add(bean);
		
		
	}

	
		
	}


