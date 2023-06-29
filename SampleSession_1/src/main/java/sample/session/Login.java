package sample.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String email= req.getParameter("email");
		String pass=req.getParameter("password");
		if(email.toLowerCase().equals("pranay.dmnsns@gmail.com") && pass.equals("12345")) {
		HttpSession session=req.getSession();
		session.setAttribute("User", email);
		resp.sendRedirect("http://localhost:8090/SampleSession_1/profile");
		}else {
			out.print("<h3>INVALID CREDENTIALS !!</h3>");
		}
	}

}
