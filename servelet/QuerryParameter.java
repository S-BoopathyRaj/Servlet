package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class QuerryParameter extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		  String email= req.getParameter("email");
		  String pass= req.getParameter("password");
		  PrintWriter pw=res.getWriter();
		  String html="<html>  <body> <h1> email="+email+"  ,  pass="+pass+"</h1> </body></html>";
		  pw.write(html);	
	}

}
