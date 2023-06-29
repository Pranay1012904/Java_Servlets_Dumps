package sample.session;

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
		//super.doPost(req, resp);
		HttpSession session=req.getSession();
		String User=(String) session.getAttribute("User");
		PrintWriter out=resp.getWriter();
		out.print("<h1>USER DETAILS</h1>");
		out.print("<h4>Hello "+User+" !!</h4>");
		out.print("<br><a href='logout'><h5>LOGOUT</h5></a>");
		//out.print("<h4>PASSWORD :"+pass+"</h4>");
	}

}
