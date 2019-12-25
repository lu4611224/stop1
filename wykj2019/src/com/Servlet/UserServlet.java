package com.Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myjdbc.bean.User;
import com.myjdbc.dao.UserDao;
import com.myjdbc.daoimp.UserDaiImp;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String dianming = request.getParameter("dianming");
		String name = request.getParameter("name");
		String telephone = request.getParameter("telephone");
		String address = request.getParameter("address");
		
		UserDao dao = new UserDaiImp();
		User user = new User();
		
		
			user.setDianming(dianming);
			user.setName(name);
			user.setTelephone(telephone);
			user.setAddress(address);
			
			
			String str = "yyy-MM-dd HH:mm:ss";
	        SimpleDateFormat sdf = new SimpleDateFormat(str);
	        Date date = new Date();
	        String dateString = sdf.format(date);
	        user.setData(dateString);
	        
	        dao.addUser(user);
	        
	        request.getRequestDispatcher("chenggong.jsp").forward(request,response); 
	        //response.sendRedirect("chenggong.jsp");
		
		
		/*
		 * //重定向 request.getRequestDispatcher("logout").forward(request,response);
		 */
		
	}

}
