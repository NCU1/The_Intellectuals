package pack14072016;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();
		out.print("<form action='./result' method='post'>"
				+ "<table>"
				+ "<tr>"
				+ "<td>User Name</td>"
				+ "<td><input type='text' name='username'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>Password</td>"
				+ "<td><input type='password' name='password'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td><input type='submit' name='action' value='Login'></td>"
				+ "</tr>"
				+ "</table>"
				+ "</form>");
		out.close();
		
	}

}
