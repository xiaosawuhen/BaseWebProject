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
	<title>ChinaZ</title>
	
	<!-- Favicon -->
	<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">

	<!-- Apple Touch Icons -->
	<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
	<link rel="apple-touch-icon" sizes="57x57" href="images/apple-touch-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="images/apple-touch-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="images/apple-touch-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="images/apple-touch-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="images/apple-touch-icon-152x152.png">
	<link rel="apple-touch-icon" sizes="180x180" href="images/apple-touch-icon-180x180.png">
	
	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/menuzord.css">
	<link rel="stylesheet" href="css/menuzord-animations.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/jquery.bxslider.css">
	<link rel="stylesheet" href="css/hover.css">
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="css/color-switcher.css">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/responsive.css">
	

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
						<a href="home-layout-1.html"><img src="images/logo.png" alt=""></a>
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
		
		
		<!-- Banner Start -->
		<div class="page-banner">
			<div class="overlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="banner-text">
							<h1>Services - 2 Columns</h1>
							<ul>
								<li><a href="home-layout-1.html">Home</a></li>
								<li><i class="fa fa-angle-right"></i></li>
								<li>Services</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Banner End -->
		
	
		<section class="service-v3">
			<div class="container">
				<div class="row">
					<div class="col-md-12">

						<ul class="service-v3-menu">
							<li class="filter" data-filter="all" data-role="button">All</li>
							<li class="filter" data-filter=".mechanical" data-role="button">Mechanical Engineering</li>
							<li class="filter" data-filter=".material" data-role="button">Material Engineering</li>
							<li class="filter" data-filter=".agriculture" data-role="button">Agriculture Processing</li>
							<li class="filter" data-filter=".chemical" data-role="button">Chemical Research</li>
						</ul>

						<div id="mix-container">
							<div class="col-md-6 mix mechanical all" data-my-order="2">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/1.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service A</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix material all" data-my-order="4">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/2.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service B</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix mechanical all" data-my-order="1">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/3.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service C</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix agriculture all" data-my-order="3">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/4.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service D</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix chemical all" data-my-order="2">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/5.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service E</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix agriculture all" data-my-order="4">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/6.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service F</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix mechanical all" data-my-order="1">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/1.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service G</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix agriculture all" data-my-order="3">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/2.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service H</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix chemical all" data-my-order="2">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/3.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service I</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix material all" data-my-order="4">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/4.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service J</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix chemical all" data-my-order="1">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/5.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service K</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 mix material all" data-my-order="3">
								<div class="inner">
									<div class="thumb">
										<img src="images/services/6.jpg" alt="">
										<div class="overlay"></div>
									</div>
									<div class="text">
										<h3><a href="service-detail.html">Service L</a></h3>
										<p>
											Ac nulla sollicitudin, vehicula volutpat, ut mauris ante, hymenaeos sem lacus fringilla vitae adipiscing. Mus ante commodo wisi, sed posuere sollicitudin.
										</p>
										<p class="button">
											<a href="service-detail.html">See More</a>
										</p>
									</div>
								</div>
							</div>
							
							
						</div>

					</div>
				</div>
			</div>
		</section>

			
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
					<div class="col-md-6 copyright">
						Copyright &copy; 2017.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a><a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
					</div>
					<div class="col-md-6 footer-menu">
						<ul>
							<li><a href="">Terms of Service</a></li>
							<li><a href="">Privacy Policy</a></li>
							<li><a href="">Contact Us</a></li>
						</ul>
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
	<script src="js/jquery-2.2.4.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/menuzord.js"></script>
	<script src="js/hoverIntent.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/owl.animate.js"></script>
	<script src="js/jquery.bxslider.min.js"></script>
	<script src="js/jquery.mixitup.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>	
	<script src="js/waypoints.min.js"></script> 
	<script src="js/jquery.counterup.min.js"></script>
	<script src="js/modernizr.min.js"></script>
	<script src="js/color-switcher.js"></script>
	<script src="js/custom.js"></script>
	
</body>
</html>

