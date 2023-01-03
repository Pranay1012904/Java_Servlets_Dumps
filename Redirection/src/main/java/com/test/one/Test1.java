package com.test.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		/*
		 * Redirect using HyperLinks !
		 * (out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h4>Ridirect to another servlet</h4>");
		out.print("<a href='http://localhost:8090/Redirection/serv2'><button>Click Here</button></a>");
		out.print("</body>");
		out.print("</html>");*/
		//Redirection using setStatus()
		resp.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
		resp.setHeader("location","http://localhost:8090/Redirection/serv2");
	}

}
