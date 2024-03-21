package servelet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Lifecycle extends GenericServlet {
	public void init()
	{
		System.out.println("hi i am init");
	}
	public void destroy()
	{
		System.out.println("Hi i am Destroy");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

}
