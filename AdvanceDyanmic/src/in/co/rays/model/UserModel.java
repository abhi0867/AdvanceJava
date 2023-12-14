package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.util.JDBCDataSource;

public class UserModel {
//	public void add(UserBean bean) throws Exception {
//		
//		Connection conn=JDBCDataSource.getConnection();
//		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
//		ps.setInt(1,findByPk());
//		ps.setString(2, bean.getFirstname());
//		ps.setString(3,bean.getLastname());
//		ps.setString(4,bean.getLoginid());
//		ps.setString(5,bean.getPassword());
//		ps.setDate(6,new java.sql.Date(bean.getDob().getTime()));
//		ps.setString(7,bean.getAddress());
//		
//		
//		int i = ps.executeUpdate();
//		
//		System.out.println("data inserted = "+i);
//	}

		
		
		public  Integer findByPk()throws Exception{
			int pk =0;
			Connection conn=JDBCDataSource.getConnection();

		PreparedStatement ps =conn.prepareStatement("select max(id) from user ");
		    
		     ResultSet rs = ps.executeQuery();
		     
		     while (rs.next()) {
		    	 
		    	pk= rs.getInt(1);
		    	 
		     }	    	 
		
			return pk +1;
		
		     }
		public UserBean authenticate(String loginid, String password) throws Exception {
			Connection con = JDBCDataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where loginid=? and password=?");
			ps.setString(1, loginid);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			UserBean bean = null;
			while (rs.next()) {
				bean = new UserBean();
				bean.setId(rs.getInt(1));
				bean.setFirst_name(rs.getString(2));
				bean.setLast_Name(rs.getString(3));
				bean.setLogin_Id(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setDob(rs.getDate(6));
				bean.setAddress(rs.getString(7));
			}
			return bean;

		}
		public List search() throws Exception {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance05", "root", "root");

			PreparedStatement ps = conn.prepareStatement("select * from user ");

			ResultSet rs = ps.executeQuery();

			List list = new ArrayList();

			while (rs.next()) {
				UserBean bean = new UserBean();
				bean.setId(rs.getInt(1));
				bean.setFirst_name(rs.getString(2));
				bean.setLast_Name(rs.getString(3));
				bean.setLogin_Id(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));
				list.add(bean);
			}
			return list;

		}


		}


			
		
		

	


