package servelet;

import java.io.IOException;
import java.io.PrintWriter;
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

public class update  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {		
		 String name=req.getParameter("name");
		 String id=req.getParameter("id");
		 int a=Integer.parseInt(id);
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
				PreparedStatement ps=c.prepareStatement("update signin set name=? where id=?");
				ps.setString(1,name);
				ps.setInt(2, a);
			    ps.executeUpdate();
					
				PrintWriter pw=res.getWriter();
				pw.print("<h1> Successfully</h1>");
	}
		 catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}

}
}
