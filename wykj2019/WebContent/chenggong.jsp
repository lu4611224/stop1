<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>   信息提交成功</title>
</head>
<body>
   <div class="content">
   <p class="a1">
	   信息提交成功!</p>
	   <p id="d1" class="a2"></p>
	 
</div>
  <%
	   response.setHeader("refresh", "2;guanzhu.jsp");
	   %>

</body>
-- <script language="javascript" type="text/javascript">
    var time = 2
    var contain = document.getElementById("d1")
    contain.innerHTML = time.toString() + "秒钟后自动跳转"
    function updateTime(){
        time = time-1
        if(time>=0){ contain.innerHTML = time.toString() + "秒钟后自动跳转" }
        else{ contain.innerHTML = "正在跳转中，请稍后。" }
    }
    setInterval("updateTime()",1000);
  
</script> 
<style type="text/css">
    .a1{
    font-size:30px ;	background: gold;width:25% ;height: 50px;margin:0 auto;padding-left:10% ;border-radius:20px;
    }
     .a2{
    font-size:30px ;width:27% ;height: 50px;margin:0 auto;padding-left:10% ;border-radius:30px;
    }
</style >
</html>