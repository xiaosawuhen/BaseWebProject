<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<head>
<title>Login</title>
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="r" />
<!--bootstrap-->
<link href="static/css/bootstrap.css" rel="stylesheet" type="text/css" />
<!--coustom css-->
<link href="static/css/style.css" rel="stylesheet" type="text/css" />
<!--page css-->
<link href="static/css/page/login.css" rel="stylesheet" type="text/css" />
<!--default-js-->
<script src="static/js/jquery-2.1.4.min.js"></script>
<!--bootstrap-js-->
<script src="static/js/bootstrap.js"></script>

<script src="static/js/responsiveslides.min.js"></script>

<script type="text/javascript">

</script>
</head>
<body>
	<header>
		<img src="static/images/login/background.jpg" alt="">	
		<form class="login-form" action="j_spring_security_check" role="form" method="POST">
			<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"> 
			<div class="login-title">
				<div>欢迎您！</div>
				<div class="login-error">
					<c:if test="SPRING_SECURITY_LAST_EXCEPTION">
						${SPRING_SECURITY_LAST_EXCEPTION.message}
					</c:if>
				</div>
			</div>
			<div class="form-group username-area" >
			  <label for="username" class="">用户名:</label>
			  <div class="col-sm-10">
			    <input type="text" class="form-control" id="j_username" name="j_username" placeholder="请输入用户名">
			  </div>
			</div>
			<div class="form-group password-area" >
			  <label for="password" class="">密码:</label>
			  <div class="col-sm-10">
			    <input type="text" class="form-control" id="j_password" name="j_password" placeholder="请输入密码">
			  </div>
			</div>
			<div class="form-group rememberme-area" >
			  <div class="">
			    <div class="checkbox">
			      <label>
			        <input type="checkbox">请记住我
			      </label>
			    </div>
			  </div>
			</div>
			<div class="form-group submit-area" >
			  <div class="">
			    <button type="submit" class="btn btn-default">登录</button>
			  </div>
			</div>
		</form>
	</header>
	<div class="boody-content">
		<section class="partner-ship">
			<div class="partner">
			</div>
			<div class="partner">
			</div>
			<div class="partner">
			</div>
		</section>
	</div>
	
	
	<footer class="footer">
		<div class="container">
			<div class="col-md-4 contact-left">

				<h4>Address</h4>
				<address>
				</address>
			</div>
			<div class="col-md-4 contact-left">

				<h4>Phone/Fax</h4>
				<p>Phone : +1234567890</p>
				<p>Phone : +1234567890</p>
				<p>Fax : +1234567890</p>
			</div>
			<div class="col-md-4 contact-left">

				<h4>Email</h4>
				<p>
					Email-1 : <a href="mailto:info@example.com">info@mycompany.com</a>
				</p>
				<p>
					Emai-2 : <a href="mailto:info@example.com">info@mycompany.com</a>
				</p>
				<p>
					Email-3 : <a href="mailto:info@example.com">info@mycompany.com</a>
				</p>
			</div>
			<div class="clearfix"></div>

			<div class="copyright">
				<p>
					Copyright &copy; 2015.Company name All rights reserved.<a
						target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
				</p>

			</div>
		</div>
	</footer>
</body>
</html>