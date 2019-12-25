<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

    
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>好吃妞</title>

    <!-- Bootstrap -->
	
    <link  rel="stylesheet" href="Bootstrap/css/bootstrap.min.css">
	 <link  rel="stylesheet" href="css/boot-mei.css">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
	
	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	
		<script src="js/jquery-3.4.1.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/jquery.nav.js"></script>
	<script>
		$(function(){
			$('.collapse a').click(function(){
				$('.navbar-collapse').collapse('hide')
			})
		})
	</script>
  </head>
  <body>

   
    
    
   
    <section id="contes" class="img-responsive">
    	<div class="lvjing">
    	<div class="container">
    		<div class="row">
    			<div class="col-md-6">
    				<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;填信息加入好吃妞</h2>
    				<p>不想出门，没菜单？想叫外卖，没电话？吃什么？不懂就问好吃妞</p>
    				<address>
    					<p><span class="glyphicon glyphicon-home"></span>联系人：稳云科技有限公司</p>
    					<p><span class="glyphicon glyphicon-earphone"></span>联系电话：11111111111111</p>
    					<p><span class="glyphicon glyphicon-envelope"></span>联系邮箱：243526134625@qq.com</p>
    				</address>
    			</div>
				<div class="col-md-6">
					<div class="row">
						<form action="UserServlet"  method="Post" name="haha" onsubmit="return validateForm()">
							<div class="col-md-6">
								<input type="text" class="form-control" name="dianming" placeholder="店名"/>
							</div>
							<div class="col-md-6">
								<input type="text" name="name" class="form-control"  placeholder="姓名" />
							</div>
							<div class="col-md-12">
								<input type="text" name="telephone" class="form-control"  placeholder="电话"/>
							</div>
							 <div class="col-md-12">
								<input type="text" name="address" class="form-control"  placeholder="地址"/>
							</div>
							<div class="col-md-12">
								<input type="checkbox" checked="checked" id="ck"/>选中
							</div>
							<div class="col-md-8">
							<input type="submit" class="form-control"  value="提交" />
							<!-- <button  class="form-control" onclick="tijiao();" type="submit">提交</button> -->
							</div>
						</form>
					</div>
				</div>
    		</div>
    		</div>
    	</div>
    </section>
    <script type="text/javascript">
      function validateForm(){
    	var dianming=document.forms["haha"]["dianming"].value;
    	var name=document.forms["haha"]["name"].value;
    	var telephone=document.forms["haha"]["telephone"].value;
    	var address=document.forms["haha"]["address"].value;
    	//let x = document.getElementById('dianming').value;
    	if (dianming==null || dianming==""){
    	  alert("店名必须填写");
    	  return false;
    	  }
    	if (name==null || name==""){
      	  alert("姓名必须填写");
      	  return false;
      	  }
    	if (telephone==null || telephone==""){
      	  alert("电话必须填写");
      	  return false;
      	  }
    	if (address==null || address==""){
      	  alert("地址必须填写");
      	  return false;
      	  }
    	if(document.getElementById('ck').checked == false){
    		alert("选中必须填写");
    		return false;
    	}
    	
    	}
      
    </script>

    
  </body>
  
</html>