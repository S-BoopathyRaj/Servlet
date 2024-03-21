package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addAttribute")
public class AddAttributes  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student s=new Student(1,"karthikeyan", 70, "chennai");
	ServletContext contex  =getServletContext();
	contex.setAttribute("Student",s);
	PrintWriter out=resp.getWriter();
	out.print("<h1>Attribute Added</h1>");
}
}
