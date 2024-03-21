package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.security.Provider.Service;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StaticServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServerException
	{	
		PrintWriter pw=res.getWriter();
		String html="<html> <body> <h1> Welcome to servlet</h1></body></html>";
		pw.print(html);
				
	}

}
