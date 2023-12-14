package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
import in.co.rays.util.DataUtility;
@WebServlet("/UserRegistrationctl")

public class UserRegistrationctl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		
		resp.sendRedirect("UserRegistrationView.jsp");
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("FirstName");
		String lname=req.getParameter("LastName");
		String login=req.getParameter("LoginId");
		String pass=req.getParameter("password");
		String dob=req.getParameter("dob");
		String add=req.getParameter("address");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(login);
		System.out.println(pass);
		System.out.println(dob);
		System.out.println(add);
		
		
		UserBean bean = new UserBean();
		bean.setFirstname(fname);
		bean.setLastname(lname);
		bean.setLoginid(login);;
		bean.setPassword(pass);
		bean.setDob(DataUtility.stringToDate(dob));
		bean.setAddress(add);
		UserModel model = new UserModel();
		try {
			model.add(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.sendRedirect("UserRegistrationView.jsp");
		
	}
	
	}
	


