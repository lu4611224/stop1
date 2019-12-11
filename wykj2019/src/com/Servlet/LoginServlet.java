package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myjdbc.bean.Login;
import com.myjdbc.dao.UserDao;
import com.myjdbc.daoimp.UserDaiImp;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDao dao = new UserDaiImp();
		Login log = dao.getLogin(username, password);
		if(username.equals(log.getUsername()) && password.equals(log.getPassword())) {
			request.getSession().setAttribute("user", log);
			request.getRequestDispatcher("logout.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "用户名或者密码错误。");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
