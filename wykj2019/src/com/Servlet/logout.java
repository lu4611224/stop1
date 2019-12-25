package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logout
 */
@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<HTML>");
		out.print("<BODY>");
		
		
		out.print("<div style='border: 1px ; text-align:center;background: honeydew;'>");

		out.print("</br>");
		out.print("</br>");
		out.print("</br>");
		out.print("信息提交成功，两天内有专员电话联系你");
		out.print("</br>");
		out.print("</br>");
		out.print("</br>");
		out.print("</br>");
		
	
		out.print("</div>");
		out.print("<div>");
		out.print("<img  src='./img/BBS/LOGO.png'  style='width:80% ; height:500px ;'>");
		out.print("</div>");
		out.print("<a href='./test.jsp'>确定</a>");
		
	
		
		
		
		
		out.print("</BODY>");
		out.print("</HTML>");
		
		/*
		 * //跳转到服务器外部的地址 response.setHeader("refresh", "3;https://www.baidu.com/");
		 */
		//跳转到服务器内部的地址
		response.setHeader("refresh", "2;guanzhu.jsp");
		
	}
	

}
