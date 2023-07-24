package sample.prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Profile extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		HttpSession session=req.getSession();
		String user= (String)session.getAttribute("user");
		String email= (String)session.getAttribute("email");
		out.print("<h1>PROFILE PAGE</h1>");
		out.print("<h3>USER :: "+user+"</h3>");
		out.print("<h3>EMAIL :: "+email+"</h3>");
		out.print("<a href='logout'>--LOGOUT--</a>");
	}

}
