﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		
		<!-- Top Bar Start -->
		<div class="top-bar-v1">
			<div class="container">
				<div class="row">
					<div class="col-md-4 top-contact">
						<div class="list">
							<i class="fa fa-envelope"></i> <a href="mailto:info@yourdomain.com">info@yourdomain.com</a>
						</div>
						<div class="list">
							<i class="fa fa-phone"></i> 123 456 7890
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
								<li><a href="index.html">Home</a></li>
								<li><a href="about.html">About Us</a></li>
								<li><a href="services.html">Service</a></li>
								<li><a href="gallery.html">Gallery</a></li>
								<li><a href="Blog.html">Blog</a></li>
								<li><a href="contact.html">Contact Us</a></li>
							</ul>
						</div>
						<!-- Nav End -->

					</div>
				</div>
			</div>
		</header>
		<!-- Header End -->

		
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


		
		<!-- Appointment Start -->
		<div class="appointment-v1">
			<div class="container">
				<div class="row">
					<div class="col-md-8">
						<div class="left">
							<h2>Make Appointment</h2>
							<p>If you like us, come to our shop and run a complete performance test.</p>
						</div>
					</div>
					<div class="col-md-4">
						<div class="right">
							<a href="">Make an Appointment</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<!-- Appointment End -->




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
					<div class="col-sm-6 col-md-4 col-lg-4">
						<div class="item">
							<div class="icon">
								<img src="static/images/service-icons/1.png" alt="">
							</div>
							<div class="text">
								<div class="inner">
									<h3>Mechanical Engineering</h3>
									<p>Ad his diam eirmod persecuti. Eum health cube scriptorem eu, eu aperiri definiebas concludaturque eam.</p>
								</div>
							</div>							
						</div>
					</div>
					<div class="col-sm-6 col-md-4 col-lg-4">
						<div class="item">
							<div class="icon">
								<img src="static/images/service-icons/2.png" alt="">
							</div>
							<div class="text">
								<div class="inner">
									<h3>Material Engineering</h3>
									<p>Ad his diam eirmod persecuti. Eum health cube scriptorem eu, eu aperiri definiebas concludaturque eam.</p>
								</div>
							</div>							
						</div>
					</div>
					<div class="col-sm-6 col-md-4 col-lg-4">
						<div class="item">
							<div class="icon">
								<img src="static/images/service-icons/3.png" alt="">
							</div>
							<div class="text">
								<div class="inner">
									<h3>Agriculture Processing</h3>
									<p>Ad his diam eirmod persecuti. Eum health cube scriptorem eu, eu aperiri definiebas concludaturque eam.</p>
								</div>
							</div>							
						</div>
					</div>
					<div class="col-sm-6 col-md-4 col-lg-4">
						<div class="item">
							<div class="icon">
								<img src="static/images/service-icons/4.png" alt="">
							</div>
							<div class="text">
								<div class="inner">
									<h3>Chemical Research</h3>
									<p>Ad his diam eirmod persecuti. Eum health cube scriptorem eu, eu aperiri definiebas concludaturque eam.</p>
								</div>
							</div>							
						</div>
					</div>
					<div class="col-sm-6 col-md-4 col-lg-4">
						<div class="item">
							<div class="icon">
								<img src="static/images/service-icons/5.png" alt="">
							</div>
							<div class="text">
								<div class="inner">
									<h3>Power and Energy</h3>
									<p>Ad his diam eirmod persecuti. Eum health cube scriptorem eu, eu aperiri definiebas concludaturque eam.</p>
								</div>
							</div>							
						</div>
					</div>
					<div class="col-sm-6 col-md-4 col-lg-4">
						<div class="item">
							<div class="icon">
								<img src="static/images/service-icons/6.png" alt="">
							</div>
							<div class="text">
								<div class="inner">
									<h3>Petroleum and Gas</h3>
									<p>Ad his diam eirmod persecuti. Eum health cube scriptorem eu, eu aperiri definiebas concludaturque eam.</p>
								</div>
							</div>							
						</div>
					</div>
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

							<div class="item">
								<div class="thumb">
									<img src="static/images/team-members/1.jpg" alt="">
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
									<h3><a href="">Patrick Flynn</a></h3>
									<p>Director</p>
								</div>
							</div>


							<div class="item">
								<div class="thumb">
									<img src="static/images/team-members/2.jpg" alt="">
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
									<h3><a href="">Brent Grundy</a></h3>
									<p>Engineer</p>
								</div>
							</div>

							<div class="item">
								<div class="thumb">
									<img src="static/images/team-members/3.jpg" alt="">
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
									<h3><a href="">Jeff Benson</a></h3>
									<p>Engineer</p>
								</div>
							</div>


							<div class="item">
								<div class="thumb">
									<img src="static/images/team-members/4.jpg" alt="">
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
									<h3><a href="">Danny Ashton</a></h3>
									<p>Manager</p>
								</div>
							</div>


							<div class="item">
								<div class="thumb">
									<img src="static/images/team-members/1.jpg" alt="">
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
									<h3><a href="">Patrick Flynn</a></h3>
									<p>Director</p>
								</div>
							</div>


							<div class="item">
								<div class="thumb">
									<img src="static/images/team-members/2.jpg" alt="">
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
									<h3><a href="">Brent Grundy</a></h3>
									<p>Engineer</p>
								</div>
							</div>

							<div class="item">
								<div class="thumb">
									<img src="static/images/team-members/3.jpg" alt="">
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
									<h3><a href="">Jeff Benson</a></h3>
									<p>Engineer</p>
								</div>
							</div>


							<div class="item">
								<div class="thumb">
									<img src="static/images/team-members/4.jpg" alt="">
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
									<h3><a href="">Danny Ashton</a></h3>
									<p>Manager</p>
								</div>
							</div>

							
						</div>
						<!-- Team Carousel End -->

					</div>
				</div>
			</div>
		</section>
		<!-- Team End -->



		<!-- Testimonial Start -->
		<section class="testimonial-v1">
			<div class="overlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="heading">
							<h2>Testimonial</h2>
							<p>Our Happy Clients Tell About Us</p>
							<div class="sep sep-white"></div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						
						<!-- Testimonial Carousel Start -->
						<div class="testimonial-carousel">
							<div class="item">
								<div class="testimonial-wrapper">								
									<div class="content">
										<div class="comment">
											<p>
												“Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.”
											</p>
											<div class="icon"></div>
										</div>
										<div class="author">
											<div class="photo">
												<img src="static/images/testimonial/2.jpg" alt="">
											</div>
											<div class="text">
												<h3>JOHN DOE </h3>
												<h4>Managing Director <span>(ABC Inc.)</span></h4>
											</div>
										</div>										
									</div>
								</div>
							</div>
							<div class="item">
								<div class="testimonial-wrapper">								
									<div class="content">
										<div class="comment">
											<p>
												“Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.”
											</p>
											<div class="icon"></div>
										</div>
										<div class="author">
											<div class="photo">
												<img src="static/images/testimonial/3.jpg" alt="">
											</div>
											<div class="text">
												<h3>JOHN DOE </h3>
												<h4>CEO <span>(XYZ Ltd.)</span></h4>
											</div>
										</div>										
									</div>
								</div>
							</div>
						</div>
						<!-- Testimonial Carousel End -->

					</div>
				</div>
			</div>
		</section>
		<!-- Testimonial End -->




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

							<div class="item">
								<div class="thumb">
									<img src="static/images/news/1.jpg" alt="">
									<div class="date">
										<div class="day">25</div>
										<div class="month">Sep</div>
									</div>
								</div>
								<div class="text">
									<h3><a href="">News Title Here</a></h3>
									<h4><i class="fa fa-comments-o" aria-hidden="true"></i> 24 Comments</h4>
									<p>
										In pede quis wisi accumsan, et posuere ac, lectus morbi hendrerit auctor aliquet sed orci, in condimentum faucibus congue vel.
									</p>
								</div>
							</div>

							<div class="item">
								<div class="thumb">
									<img src="static/images/news/2.jpg" alt="">
									<div class="date">
										<div class="day">11</div>
										<div class="month">Aug</div>
									</div>
								</div>
								<div class="text">
									<h3><a href="">News Title Here</a></h3>
									<h4><i class="fa fa-comments-o" aria-hidden="true"></i> 24 Comments</h4>
									<p>
										In pede quis wisi accumsan, et posuere ac, lectus morbi hendrerit auctor aliquet sed orci, in condimentum faucibus congue vel.
									</p>
								</div>
							</div>

							<div class="item">
								<div class="thumb">
									<img src="static/images/news/3.jpg" alt="">
									<div class="date">
										<div class="day">28</div>
										<div class="month">Jun</div>
									</div>
								</div>
								<div class="text">
									<h3><a href="">News Title Here</a></h3>
									<h4><i class="fa fa-comments-o" aria-hidden="true"></i> 24 Comments</h4>
									<p>
										In pede quis wisi accumsan, et posuere ac, lectus morbi hendrerit auctor aliquet sed orci, in condimentum faucibus congue vel.
									</p>
								</div>
							</div>

							<div class="item">
								<div class="thumb">
									<img src="static/images/news/4.jpg" alt="">
									<div class="date">
										<div class="day">25</div>
										<div class="month">Sep</div>
									</div>
								</div>
								<div class="text">
									<h3><a href="">News Title Here</a></h3>
									<h4><i class="fa fa-comments-o" aria-hidden="true"></i> 24 Comments</h4>
									<p>
										In pede quis wisi accumsan, et posuere ac, lectus morbi hendrerit auctor aliquet sed orci, in condimentum faucibus congue vel.
									</p>
								</div>
							</div>

							<div class="item">
								<div class="thumb">
									<img src="static/images/news/5.jpg" alt="">
									<div class="date">
										<div class="day">11</div>
										<div class="month">Aug</div>
									</div>
								</div>
								<div class="text">
									<h3><a href="">News Title Here</a></h3>
									<h4><i class="fa fa-comments-o" aria-hidden="true"></i> 24 Comments</h4>
									<p>
										In pede quis wisi accumsan, et posuere ac, lectus morbi hendrerit auctor aliquet sed orci, in condimentum faucibus congue vel.
									</p>
								</div>
							</div>

							<div class="item">
								<div class="thumb">
									<img src="static/images/news/6.jpg" alt="">
									<div class="date">
										<div class="day">28</div>
										<div class="month">Jun</div>
									</div>
								</div>
								<div class="text">
									<h3><a href="">News Title Here</a></h3>
									<h4><i class="fa fa-comments-o" aria-hidden="true"></i> 24 Comments</h4>
									<p>
										In pede quis wisi accumsan, et posuere ac, lectus morbi hendrerit auctor aliquet sed orci, in condimentum faucibus congue vel.
									</p>
								</div>
							</div>
							
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
							<p><span class="counter">45</span></p>
							<p><span>Branches</span></p>
						</div>
					</div>
					<div class="col-md-3 col-sm-6">
						<div class="counter-text">
							<p><span class="counter">65</span></p>
							<p><span>Staffs</span></p>
						</div>
					</div>
					<div class="col-md-3 col-sm-6">
						<div class="counter-text">
							<p><span class="counter">2560</span></p>
							<p><span>Customers</span></p>
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
							<h2>Our Partners</h2>
							<p>All Our Company Partners are Listed Below</p>
							<div class="sep"></div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
							
						<div class="partner-carousel">
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/1.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/2.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/3.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/4.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/5.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/1.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/2.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/3.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/4.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/5.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/1.png" alt=""></a>
								</div>
							</div>
							<div class="item">
								<div class="inner">
									<a href="#"><img src="static/images/partner/2.png" alt=""></a>
								</div>
							</div>
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

		
		<!-- Footer Main Start -->
		<section class="footer-main">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-md-3 col-lg-3 footer-col">
						<h3>About zFactory</h3>
						<p>
							Dicant discere pro no, no pri prima facilisi. Sit munere voluptaria ea. Ex per fugit prodesset adipiscing, viderer aliquam et vim. Id enim esse deleniti mel, vix eirmod omittam constituam ad. Choro doming mea eu, melius docendi tractatos cu quo.
						</p>
					</div>
					<div class="col-sm-6 col-md-3 col-lg-3 footer-col">
						<h3>Latest News</h3>
						<div class="news-item">
							<div class="news-title"><a href="#">Lorem ipsum dolor sit amet, pri ea option scripserit, ex vis affert tantas graece</a></div>
							<div class="news-date"><a href="#">July 24, 2017</a></div>
						</div>
						<div class="news-item">
							<div class="news-title"><a href="#">Lorem ipsum dolor sit amet, pri ea option scripserit, ex vis affert tantas graece</a></div>
							<div class="news-date"><a href="#">July 24, 2017</a></div>
						</div>
					</div>
					<div class="col-sm-6 col-md-3 col-lg-3 footer-col">
						<h3>Important Links</h3>
						<div class="row">
							<div class="col-md-12">
								<ul>
									<li><a href="#">Industrial Service 1</a></li>
									<li><a href="#">Industrial Service 2</a></li>
									<li><a href="#">Industrial Service 3</a></li>
									<li><a href="#">Industrial Service 4</a></li>
									<li><a href="#">Industrial Service 5</a></li>
								</ul>
							</div>
						</div>						
					</div>
					<div class="col-sm-6 col-md-3 col-lg-3 footer-col">
						<h3>Contact Us</h3>
						<div class="contact-item">
							<div class="icon"><i class="fa fa-map-marker"></i></div>
							<div class="text">Unum debitis pro id, explicari</div>
						</div>
						<div class="contact-item">
							<div class="icon"><i class="fa fa-phone"></i></div>
							<div class="text">123-456-7878</div>
						</div>
						<div class="contact-item">
							<div class="icon"><i class="fa fa-fax"></i></div>
							<div class="text">123-456-7890</div>
						</div>
						<div class="contact-item">
							<div class="icon"><i class="fa fa-envelope-o"></i></div>
							<div class="text">info@yokobd.com</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Footer Main End -->

		
		<!-- Footer Bottom Start -->
		<section class="footer-bottom">
			<div class="container">
				<div class="row">
					<div class="col-md-8 copyright">
						Copyright &copy; 2017.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
					<div class="col-md-4 footer-menu">
						
					</div>
				</div>
			</div>
		</section>
		<!-- Footer Bottom End -->



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

