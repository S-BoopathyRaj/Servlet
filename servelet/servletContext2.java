package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class servletContext2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	   ServletContext context =getServletContext();
	   String email =context.getInitParameter("email");
	   PrintWriter pw=res.getWriter();
	   pw.print("<h1> email:"+email+"</h1>");
		
	}
	

}
