package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class signin extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	      String id=req.getParameter("id");
	      int i=Integer.parseInt(id);
		  String name =req.getParameter("name");
		  String email=req.getParameter("email");
		  String  password= req.getParameter("password");
		  String  mobile= req.getParameter("mobile");
		
		//  long l=Long.parseLong(mobile);
		  
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
			PreparedStatement ps=c.prepareStatement("insert into signin values(?,?,?,?,?)");
			ps.setInt(1,i);
			ps.setString(2,name);
			ps.setString(3,email);
			ps.setString(4,password);
			ps.setString(5,mobile);
			ps.executeUpdate();
			PrintWriter pw=res.getWriter();
			String html="<html>  <body> <h1> SuccessFully </h1> </body></html>";
			pw.print(html);
			
					
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		  
		  
		 
		
	}

}
