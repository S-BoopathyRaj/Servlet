package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deleteAttribute")
public class DeleteAttribute extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	               ServletContext context =getServletContext();
	               context.removeAttribute("Student");
	               PrintWriter pw=resp.getWriter();
	               pw.print("<h1> Delete Successfully</h1>");
}
}
