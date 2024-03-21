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

@WebServlet("/spam")
public class SpamPage  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  HttpSession session =req.getSession(false);
	  PrintWriter pw=resp.getWriter();
	  if(session !=null)
	  {
		  pw.print("<h1>Welcome spam page</h1>");
	  }
	  else
	  {
		  pw.print("<h1>Go and login</h1>");
	  }

	  	
	    
	  
		
	}
}
