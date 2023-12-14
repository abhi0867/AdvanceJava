package in.co.rays.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SecondServlet")

public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("FirstName");
		String lname=req.getParameter("lName");	
     String  address=req.getParameter("Address");
		
		System.out.println("secondservalet doget");
		System.out.println();
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(address);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("FirstName");
		String lname=req.getParameter("LastName");	
		String  address=req.getParameter("Address");
		
		System.out.println("second servalet dopost");
		System.out.println();
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(address);
	}
	

}
