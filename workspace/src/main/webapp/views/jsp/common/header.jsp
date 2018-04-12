<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<link rel="stylesheet" href="static/css/userStyle.css">
		<!-- Top Bar Start -->
		<div class="top-bar-v1">
			<div class="container">
				<div class="row">
					<div class="col-md-4 top-contact">
						<div class="list">
							<i class="fa fa-envelope"></i> <a href="mailto:${company.mail}">${company.mail}</a>
						</div>
						<div class="list">
							<i class="fa fa-phone"></i> ${company.tel}
						</div>
					</div>
					<div class="col-md-8 top-social">
						<ul>
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
							<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
							<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
							<li><a href="#"><i class="fa fa-youtube"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- Top Bar End -->

		<!-- Header Start -->
		<header>
			<div class="container">
				<div class="row">
					<div class="col-md-4 logo">
						<a href="home-layout-1.html"><img src="static/images/logo.png" alt=""></a>
					</div>
					<div class="col-md-8 nav-wrapper">

						<!-- Nav Start -->
						<div id="menuzord" class="menuzord">
							<ul class="menuzord-menu">
								<li><a href="index">主页</a></li>
								<li><a href="about">公司介绍</a></li>
								<li><a href="services">我们的服务</a></li>
								<li><a href="product">产品展示</a></li>
								<li><a href="gallery">精品案例</a></li>
								<li><a href="contact">联系我们</a></li>
							</ul>
						</div>
						<!-- Nav End -->

					</div>
				</div>
			</div>
		</header>
		<!-- Header End -->
