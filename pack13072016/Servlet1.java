package pack13072016;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();
		out.print("<html>"
				+ "<body>"
				+ "This is my first servlet program."
				+ "<br/><a href='./'>back</a>"
				+ "</body>"
				+ "</html>");
		out.close();
	}

}
