package in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class Session extends  HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      String u_email=req.getParameter("name");
	      String u_pass=req.getParameter("pass");
	      PrintWriter pw=resp.getWriter();
	     if(u_email.equals("boopathy@gmail.com") && u_pass.equals("123"))
	     {
	    	  HttpSession session =req.getSession(true);
	    	  RequestDispatcher dispatcher =req.getRequestDispatcher("spam");
	    	  dispatcher.forward(req, resp);
	      }else
	      {
	    	  pw.print("<h1> Invalied email or password</h1>");
	    	  RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
	    	  dispatcher.include(req, resp);
	      }
	      
	}

}