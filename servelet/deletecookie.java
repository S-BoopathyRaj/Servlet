package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deletecookie")

public class deletecookie  extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  Cookie arr[]=req.getCookies();
		 
		  for(Cookie c:arr)
		  {
			  String name=c.getName();
			if(name.equals("pass") && name.equals("email")) {
				c.setMaxAge(0);
				res.addCookie(c);
				res.getWriter().print("<h1>cookies delected</h1>");
		  }
}
	
}

		
}
