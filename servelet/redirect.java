package servelet;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/get")
public class redirect extends HttpServlet {
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServerException
    {
    	res.sendRedirect("https://www.youtube.com/");
    }
}
