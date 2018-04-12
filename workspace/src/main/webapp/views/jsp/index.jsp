<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html dir="ltr" lang="en">
<head>
<base href="<%=basePath%>">

	<!-- Meta Tags -->	
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta name="description" content="ChinaZ">
	<meta name="keywords" content="">
	<meta name="author" content="">

	<!-- Title -->
	<title>Home</title>
	
	<!-- Favicon -->
	<link rel="shortcut icon" href="static/images/favicon.ico" type="image/x-icon">

	<!-- Apple Touch Icons -->
	<link rel="apple-touch-icon" href="static/images/apple-touch-icon.png">
	<link rel="apple-touch-icon" sizes="57x57" href="static/images/apple-touch-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="72x72" href="static/images/apple-touch-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="static/images/apple-touch-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="static/images/apple-touch-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="static/images/apple-touch-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="static/images/apple-touch-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="static/images/apple-touch-icon-152x152.png">
	<link rel="apple-touch-icon" sizes="180x180" href="static/images/apple-touch-icon-180x180.png">
	
	<!-- Stylesheets -->
	<link rel="stylesheet" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" href="static/css/menuzord.css">
	<link rel="stylesheet" href="static/css/menuzord-animations.css">
	<link rel="stylesheet" href="static/css/animate.css">
	<link rel="stylesheet" href="static/css/jquery.bxslider.css">
	<link rel="stylesheet" href="static/css/hover.css">
	<link rel="stylesheet" href="static/css/magnific-popup.css">
	<link rel="stylesheet" href="static/css/color-switcher.css">
	<link rel="stylesheet" href="static/css/style.css">
	<link rel="stylesheet" href="static/css/responsive.css">
	

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	  <script src="http://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	  <script src="http://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body>
     

	
	<div id="preloader">
		<div id="status"></div>
	</div>
	
	<div class="page-wrapper">
		
		<c:import url="common/header.jsp"></c:import>
		
		<!-- Slider Start -->
		<section class="main-slider">
			<div class="slider">
				<ul class="bxslider">
					<li style="background-image:url(static/images/slides/1.jpg);">
						<div class="overlay"></div>
						<div class="content">
							<div class="inner tal">
								<h2>
									High Quality Materials
								</h2>
								<h3>
									Your Reliable Industrial Solution
								</h3>
								<p class="button">
									<a href="" class="btn btn-flat">View Details</a>
								</p>
							</div>
						</div>
					</li>
					<li style="background-image:url(static/images/slides/2.jpg);">
						<div class="overlay"></div>
						<div class="content">
							<div class="inner tar">
								<h2>
									24/7 Hours Services
								</h2>
								<h3>
									We are always available here to help you
								</h3>
								<p class="button">
									<a href="" class="btn btn-flat">View Details</a>
								</p>
							</div>
						</div>
					</li>								
				</ul>
			</div>
		</section>
		<!-- Slider End -->
		
		<!-- Service Start -->
		<section class="service-v1">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="heading">
							<h2>Our Services</h2>
							<p>We Are Here to Provide You Awesome Service Always</p>
							<div class="sep"></div>
						</div>
					</div>
				</div>
				<div class="row">
					<c:forEach items="${servicesList}" var="services">
						<div class="col-sm-6 col-md-4 col-lg-4">
							<div class="item">
								<div class="icon">
									<img src="${services.imgUrl}" alt="" class="services-image-index">
								</div>
								<div class="text">
									<div class="inner">
										<h3>${services.name}</h3>
										<p>${services.description}</p>
									</div>
								</div>							
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</section>
		<!-- Service End -->

		<!-- Team Start -->
		<section class="team-v1">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="heading">
							<h2>Our Team Members</h2>
							<p>Our Team Members have the best skills in car industry</p>
							<div class="sep"></div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						
						<!-- Team Carousel Start -->
						<div class="team-carousel">

						<c:forEach items="${employeeList}" var="employee">
							<div class="item">
								<div class="thumb">
									<img src="${employee.imgUrl}" alt="" class="employee-image-index">
									<div class="overlay"></div>
									<div class="social-icons">
										<ul>
											<li><a href="#"><i class="fa fa-facebook"></i></a></li>
											<li><a href="#"><i class="fa fa-twitter"></i></a></li>
											<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
											<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
										</ul>
									</div>
								</div>
								<div class="text">
									<h3><a href="">${employee.name}</a></h3>
									<p>Director</p>
								</div>
							</div>
						</c:forEach>
						</div>
						<!-- Team Carousel End -->

					</div>
				</div>
			</div>
		</section>
		<!-- Team End -->

		<!-- News Start -->
		<section class="news-v1">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="heading">
							<h2>Latest News</h2>
							<p>See All Our Updated and Latest News</p>
							<div class="sep"></div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						
						<!-- News Carousel Start -->
						<div class="news-carousel">
						<c:forEach items="${newsList}" var="news">
							<div class="item">
								<div class="thumb">
									<img src="${news.imgUrl}" alt="">
									<div class="date">
										<div class="day">25</div>
										<div class="month">Sep</div>
									</div>
								</div>
								<div class="text">
									<h3><a href="">${news.title}</a></h3>
									<p>
										${news.description}
									</p>
								</div>
							</div>
						</c:forEach>
						</div>
						<!-- News Carousel End -->

					</div>
				</div>
			</div>
		</section>
		<!-- News End -->



		<!-- Counter Start -->
		<section class="counter-v1 parallax parallax-1">
			<div class="overlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-sm-6">
						<div class="counter-text">
							<p><span class="counter">${projectList.size()}</span></p>
							<p><span>Products</span></p>
						</div>
					</div>
					<div class="col-md-3 col-sm-6">
						<div class="counter-text">
							<p><span class="counter">${employeeList.size()}</span></p>
							<p><span>Staffs</span></p>
						</div>
					</div>
					<div class="col-md-3 col-sm-6">
						<div class="counter-text">
							<p><span class="counter">${credentialList.size()}</span></p>
							<p><span>Credentials</span></p>
						</div>
					</div>
					<div class="col-md-3 col-sm-6">
						<div class="counter-text">
							<p><span class="counter">18</span></p>
							<p><span>Years Experience</span></p>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Counter End -->

			

		<!-- Partner Start -->
		<section class="partner-v1">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="heading">
							<h2>Our Credentials</h2>
							<p>All Our Company Credentials are Listed Below</p>
							<div class="sep"></div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
							
						<div class="partner-carousel">
						<c:forEach items="${credentialList}" var="credential">
							<div class="item">
								<div class="inner">
									<a href="#"><img src="${credential.imgUrl}" alt=""></a>
								</div>
							</div>
						</c:forEach>
						</div>

					</div>
				</div>
			</div>
		</section>
		<!-- Partner End -->


		<!-- Footer Social Start -->
		<section class="footer-social">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="item">
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
		</section>
		<!-- Footer Social End -->

		<c:import url="common/footer.jsp"></c:import>

		<a href="#" class="scrollup">
			<i class="fa fa-angle-up"></i>
		</a>

	</div>

	
	<!-- Scripts -->
	<script src="static/js/jquery-2.2.4.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/menuzord.js"></script>
	<script src="static/js/hoverIntent.js"></script>
	<script src="static/js/owl.carousel.min.js"></script>
	<script src="static/js/owl.animate.js"></script>
	<script src="static/js/jquery.bxslider.min.js"></script>
	<script src="static/js/jquery.mixitup.min.js"></script>
	<script src="static/js/jquery.magnific-popup.min.js"></script>	
	<script src="static/js/waypoints.min.js"></script> 
	<script src="static/js/jquery.counterup.min.js"></script>
	<script src="static/js/modernizr.min.js"></script>
	<script src="static/js/color-switcher.js"></script>
	<script src="static/js/custom.js"></script>
	
</body>
</html>

