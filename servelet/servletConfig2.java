package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class servletConfig2  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		        String name = config.getInitParameter("Name");
		        PrintWriter pw=res.getWriter();
		        pw.print("<h1> Name:="+name+"</h1>");
		
		
	}


}
