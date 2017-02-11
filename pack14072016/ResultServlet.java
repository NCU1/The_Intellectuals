package pack14072016;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserBean userBean = new UserBean(userName, password);
		UserDAO dao = new UserDAO();
		
		
		HttpSession session = request.getSession();
		session.setAttribute("user", userBean);
		
		
		String result = "";
		if(dao.login(userBean)==true)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("./home");
			dispatcher.forward(request, response);
		}
		else
		{
			response.sendRedirect("./error");
		}
		
	}


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserBean userBean = new UserBean(userName, password);
		UserDAO dao = new UserDAO();
		
		
		HttpSession session = request.getSession();
		session.setAttribute("user", userBean);
		
		
		String result = "";
		if(dao.login(userBean)==true)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("./home");
			dispatcher.forward(request, response);
		}
		else
		{
			response.sendRedirect("./error");
		}
		
	}

}
