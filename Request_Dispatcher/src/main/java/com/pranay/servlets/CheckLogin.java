package com.pranay.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLogin extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		if(email.equalsIgnoreCase("pranay.dmnsns@gmail.com") && password.equalsIgnoreCase("iamibmer")) {
			RequestDispatcher rd=req.getRequestDispatcher("profile.html");
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("error.html");
			rd.forward(req, resp);
		}
	}
}
