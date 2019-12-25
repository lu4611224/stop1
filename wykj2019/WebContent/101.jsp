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

<%
UserDao dao = new UserDaiImp();
User user = new User();

List<User> list = new ArrayList<User>();
list = dao.getAll();
SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
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
			     
<%
for (User u1 : list) {
	%>
	<tr>
	   <td><%=u1.getId() %></td>
	   <td><%=u1.getDianming() %></td>
	   <td><%=u1.getName() %></td>
	   <td><%=u1.getTelephone() %></td>
	   <td><%=u1.getAddress() %></td>
	   <td><%=format.format(format.parse(u1.getData())) %></td>
	</tr>
	<%
}

%>
              </table>
              </div>
	       </div>
	   </div>
<%
%>

</body>
</html>