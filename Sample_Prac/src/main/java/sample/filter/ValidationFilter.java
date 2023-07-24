package sample.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ValidationFilter implements Filter {
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		boolean status=true;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		if(user == null || user.equals("")) {
			status= false;
		}
		
		if(email == null || email.equals("")) {
			status= false;
		}
		
		if(pass == null || pass.equals("")) {
			status= false;
		}
		
		if(status) {
			chain.doFilter(request, response);
			
		}else {
			ServletContext context=request.getServletContext();
			String error=context.getInitParameter("error");
			out.print(error);
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		//Filter.super.init(filterConfig);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//Filter.super.destroy();
	}

}
