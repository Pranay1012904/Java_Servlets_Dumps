package com.sample.two;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		if(name.trim().equals("") || password.trim().equals("")) {
			out.print("Values Can't be NULL");
		}else {
			out.print("<h3>DATA</h3>");
			out.print("\n\nNAME: "+name);
			out.print("\n\nPASSWORD: "+password);
		}
	}
	
	
}
