package in;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/jspdemo")
public class jspdemo  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s=new Student();
		s.setId(1);	
		s.setName("boopathy");
		s.setMark(67);
		s.setAge(23);
		
		req.setAttribute("Student", s);
		RequestDispatcher dispatcher=req.getRequestDispatcher("jspdemo.jsp");
		dispatcher.forward(req, resp);
	}

}
