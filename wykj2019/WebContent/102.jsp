<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.myjdbc.daoimp.UserDaiImp"%>
<%@page import="com.myjdbc.dao.UserDao"%>
<%@page import="java.util.HashSet"%>
<%@page import="com.myjdbc.bean.User"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link  rel="stylesheet" href="Bootstrap/css/bootstrap.min.css">
<style>
 .container{
   text-align: center;  
 }
 th {
    text-align: center;
}
</style>
</head>
<body>


   <div class="container">
	   <div class="row">
	       <div class="col-md-12">
	           <table class="table table-bordered">
	              <thead>
							  <tr>
							  	<th>编号</th>
							  	<th>店名</th>
							  	<th>名字</th>
							  	<th>电话</th>
							  	<th>地址</th>
							  	<th>注册时间</th>
							  </tr>
			      </thead>
<c:forEach var="list" items="${list }">
     <tr>
	   <td>${list.id }</td>
	   <td>${list.dianming }</td>
	   <td>${list.name }</td>
	   <td>${list.telephone }</td>
	   <td>${list.address }</td>
	   <td>${list.data }</td>
	</tr>
</c:forEach>			     

              </table>
              
              
              <%
   String pagecount = (String)request.getAttribute("spagecount");
   String pagenow = (String)request.getAttribute("spagenow");
   int ab = Integer.parseInt(pagecount);
   int pgn = Integer.parseInt(pagenow);
   
   int previousPage = pgn-1;
   int nextPage = pgn+1;
  if(previousPage<1){
	  previousPage = 1;
  }
  if(nextPage>ab){
	  nextPage = ab;
  }
%>
   <a href="finf?id=1">首页</a>
   <a href="finf?id=<%=previousPage%>">上一页</a>
   <a href="finf?id=<%=nextPage%>">下一页</a>
   <a href="finf?id=<%=ab%>">尾页</a>
<%
          
        %>
        
        
<!--  -->   


<!--  -->          
              
              </div>
	       </div>
	   </div>


</body>
</html>