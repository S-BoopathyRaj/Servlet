package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.mysql.cj.protocol.Resultset;

public class fetch  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		  String id= req.getParameter("id");
		  int i=Integer.parseInt(id);
		  
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
			PreparedStatement ps=c.prepareStatement("select * from signin where id=?");
			ps.setInt(1, i);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
            	String name=  rs.getString(2);
            	String email = rs.getString(3);
            	 String password= rs.getString(4);
            	  String mobile= rs.getString(5);
                  PrintWriter pw=res.getWriter();
       		     String out="<html><body> <h1>  name:"+name+" </h1> <h2> email:"+email+"</h2> <h3> password:"+password+" </h3> <h4>mobile:"+mobile+"</h4></body></html>";
       		      pw.print(out);
            }
            
            
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		   
		   
		
	}

}
