package com.Servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myjdbc.bean.Login;
import com.myjdbc.bean.User;
import com.myjdbc.dao.UserDao;
import com.myjdbc.daoimp.UserDaiImp;

/**
 * Servlet implementation class finf
 */
@WebServlet("/finf")
public class finf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public finf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request, response);
		UserDao dao = new UserDaiImp();
		User user = new User();
		    int pageCount =0;   //一起有多少页
	        int rowcount =0;    //一起有多少条记录
	        int pagesize =15;    //一页显示多少条记录
	        int pagenow = 0;     //要显示的是第几页
	        String pgn = request.getParameter("id");
	        if(pgn!=null){
	            pagenow = Integer.parseInt(pgn);
	        }else {
	        	pagenow = 1;
			}
	        rowcount = dao.getcou();
	        //求出总页数
	        pageCount = (int)Math.ceil(rowcount/pagesize)+1;
	        System.out.println(pageCount);
	        
	        List list = dao.find(pagenow, pagesize);
	        String spagecount = pageCount+"";
	        String spagenow  = pagenow+"";
	        request.setAttribute("list",list);
	        request.setAttribute("spagecount",spagecount);
	        request.setAttribute("spagenow",spagenow);
	        request.getRequestDispatcher("102.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//int id = Integer.parseInt(request.getParameter("id"));
       // String dateString = sdf.format(date);
//		UserDao dao = new UserDaiImp();
//		User user = new User();
//	    Login log = new Login();
//	    List<User> list = new ArrayList<User>();
//	    list = dao.find(1);
//	    request.setAttribute("list", list);
//	    request.getRequestDispatcher("102.jsp").forward(request, response);
//	    for (User user2 : list) {
//	    	System.out.println(user2.getId());
//			System.out.println(user2.getName());
//			System.out.println(user2.getTelephone());
//			try {
//				System.out.println(format.format(format.parse(user2.getData())));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("-----------------------------------------");
//		}
	    
	}

}
