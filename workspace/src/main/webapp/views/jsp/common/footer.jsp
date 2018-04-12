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
		
		<!-- Footer Main Start -->
		<section class="footer-main">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-md-3 col-lg-3 footer-col">
						<h3>About ${company.name}</h3>
						<p>
							${company.description}
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
						<h3>合作伙伴链接</h3>
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
						<h3>联系我们</h3>
						<div class="contact-item">
							<div class="icon"><i class="fa fa-map-marker"></i></div>
							<div class="text">${company.address}</div>
						</div>
						<div class="contact-item">
							<div class="icon"><i class="fa fa-phone"></i></div>
							<div class="text">${company.tel}</div>
						</div>
						<div class="contact-item">
							<div class="icon"><i class="fa fa-fax"></i></div>
							<div class="text">${company.fax}</div>
						</div>
						<div class="contact-item">
							<div class="icon"><i class="fa fa-envelope-o"></i></div>
							<div class="text">${company.mail}</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Footer Main End -->