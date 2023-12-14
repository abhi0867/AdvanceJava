package in.co.rays.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpServer;

@WebServlet("/FirstServlet")


public class FirstServlet extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("FirstName");
		String lname=req.getParameter("lname");
		String address=req.getParameter("Address");
		
		System.out.println("Firestservlet doget");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(address);

	

		resp.sendRedirect("SecondServlet");
//		RequestDispatcher rd=req.getRequestDispatcher("SecondServlet");
//		rd.forward(req, resp);
		
		
		
		
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("FirstName");
		String lname=req.getParameter("LastName");	
		
		

		System.out.println("First servlet dopost");
		
		System.out.println(fname);
		System.out.println(lname);
	
		//resp.sendRedirect("SecondServlet");
		//RequestDispatcher rd=req.getRequestDispatcher("SecondServlet");
	//	rd.forward(req, resp);
	}
	
	

	}

		

	
	


