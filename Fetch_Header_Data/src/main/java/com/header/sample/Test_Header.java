package com.header.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test_Header extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		Enumeration<String> headernames=req.getHeaderNames();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<table border='1'>");
		while(headernames.hasMoreElements()) {
			String headername=headernames.nextElement();
			String headervalue=req.getHeader(headername);
			out.print("<tr>");
			out.print("<td>"+headername+"</td>");
			out.print("<td>"+headervalue+"</td>");
			out.print("</tr>");	
		}
		
		out.print("</table>");
		out.print("</html>");
		
	}

}
