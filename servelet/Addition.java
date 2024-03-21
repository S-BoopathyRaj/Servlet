package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Addition  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		int Result=a+b;
		PrintWriter pw=res.getWriter();
		String html="<html>  <body> <h1> Result="+Result+" </h1> </body></html>";
		pw.print(html);
		
	}
	

}
