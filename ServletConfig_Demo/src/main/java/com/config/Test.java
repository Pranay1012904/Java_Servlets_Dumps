package com.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		ServletConfig config=getServletConfig();
		
		String email=config.getInitParameter("email");
		String classNm=config.getInitParameter("Class");
		out.print("\nCLASS: "+classNm);
		out.print("\n\nEMAIL: "+email);
	}

}
