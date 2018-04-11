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
<html lang="en">
<head>
    <meta charset="utf-8">
	<base href="<%=basePath%>">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>后台管理系统</title>

    <!-- Bootstrap CSS -->    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="static/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="static/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="static/css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="static/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
	<link href="static/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link href="static/css/owl.carousel.css" type="text/css" rel="stylesheet" >
	<link href="static/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link href="static/css/fullcalendar.css" rel="stylesheet" >
	<link href="static/css/widgets.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    <link href="static/css/style-responsive.css" rel="stylesheet" />
	<link href="static/css/xcharts.min.css" rel=" stylesheet">	
	<link href="static/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="static/js/html5shiv.js"></script>
      <script src="static/js/respond.min.js"></script>
      <script src="static/js/lte-ie7.js"></script>
    <![endif]-->
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
     
      <!-- headerjsp -->
      <c:import url="../../common/header.jsp"></c:import>
      <c:import url="../../common/menu.jsp"></c:import>
      
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-files-o"></i> 员工信息管理</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">后台管理</a></li>
						<li><i class="fa fa-laptop"></i>员工信息编辑</li>
					</ol>
				</div>
			</div>
              <!-- Form validations -->              
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
							公司基本信息
                          </header>
                          <div class="panel-body">
                              <div class="form">
                                  <form class="form-validate form-horizontal" id="employeeForm" method="post" action="employee/update">
                                      <input class="form-control" id="eid" name="eid" type="hidden" value="${employee.eid}"/>
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">员工名称<span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control" id="name" name="name" value="${employee.name}" minlength="5" type="text" required />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="cemail" class="control-label col-lg-2">员工性别<span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="sex" type="text" name="sex" value="${employee.sex}" required />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="curl" class="control-label col-lg-2">员工账号</label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="aliasName" type="text" name="aliasName" value="${employee.aliasName}"/>
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">员工电话<span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control" id="phone" name="phone" value="${employee.phone}" minlength="5" type="text" required />
                                          </div>
                                      </div>                                      
                                      <div class="form-group ">
                                          <label for="ccomment" class="control-label col-lg-2">员工邮箱</label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="email" type="email" name="email" value="${employee.email}" />
                                          </div>
                                      </div>                               
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit">保存</button>
<!--                                               <button class="btn btn-default" type="button">取消</button> -->
                                          </div>
                                      </div>
                                  </form>
                              </div>

                          </div>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
      <!-- 确认消息模态框 -->
	<div class="modal fade" id="confirm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop='static'>
		<div class="modal-dialog" style="width:500px;">
			<div class="modal-content">
				<div class="modal-header" style="font-size:16px; color:#fff; background-color:#0054a6; padding:9px;">
					<button type="button" class="close" data-dismiss="modal" style="color:#fff; opacity:1;" aria-hidden="true">&times;</button>
					<div>确认消息</div>
				</div>
				<div class="modal-body">
					<div id="modalInfo" style="text-align:center; margin:10px 0;"></div>
				</div>
				<div class="cct-popup-content-bjbz-foot">
					<button id="okBtn" type="button" style="margin-right:0px;width: 100px;margin-left:260px;" class="cct-popup-content-bjbz-btn" data-dismiss="modal">OK</button>
					<button id="cancleBtn" type="button" style="margin-right:0px;margin-left:10px;width: 100px;" class="cct-popup-content-bjbz-btn" data-dismiss="modal">Cancel</button>
				</div>
			</div>
		</div>
	</div>
  </section>
  <!-- container section start -->

    <!-- javascripts -->
    <script src="static/js/jquery.js"></script>
	<script src="static/js/jquery-ui-1.10.4.min.js"></script>
    <script src="static/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="static/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="static/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="static/js/jquery.scrollTo.min.js"></script>
    <script src="static/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="static/assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="static/js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="static/js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <<script src="static/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
	<script src="static/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="static/js/calendar-custom.js"></script>
	<script src="static/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="static/js/jquery.customSelect.min.js" ></script>
	<script src="static/assets/chart-master/Chart.js"></script>
   
    <!--custome script for all page-->
    <script src="static/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="static/js/sparkline-chart.js"></script>
    <script src="static/js/easy-pie-chart.js"></script>
	<script src="static/js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="static/js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="static/js/xcharts.min.js"></script>
	<script src="static/js/jquery.autosize.min.js"></script>
	<script src="static/js/jquery.placeholder.min.js"></script>
	<script src="static/js/gdp-data.js"></script>	
	<script src="static/js/morris.min.js"></script>
	<script src="static/js/sparklines.js"></script>	
	<script src="static/js/charts.js"></script>
	<script src="static/js/jquery.slimscroll.min.js"></script>
  <script>

  $(document).ready(function() {

		function modalConfirm(data,callback){
			$("#confirm #modalInfo").text(data);
			$("#confirm").modal('show');
			
			$("#confirm #okBtn").unbind("click");
			if( typeof callback != "undefine") {
				$("#confirm #okBtn").bind("click", callback);
			}
		}
	  jQuery.prototype.serializeObject=function(){  
	      var obj=new Object();  
	      $.each(this.serializeArray(),function(index,param){  
	          if(!(param.name in obj)){  
	              obj[param.name]=param.value;  
	          }  
	      });  
	      return obj;  
	  };  
	  
      $("#employeeForm").on("submit", function(){
    	  var form = this;
    	  modalConfirm("是否确认修改信息",function(){
   		   var dataPara = JSON.stringify($("#employeeForm").serializeObject()); 
   		   $.ajax({
   		      url : form.action,
   		      type : form.method,
   		      data : dataPara,//可能会出现后台接收到的参数值为null的情况，原因是form.js的源码不全，没有data这个参数，需要重新下载官网的源码。
   		      dataType : "json",
   		      contentType: "application/json; charset=utf-8",
   		      async: false,//异步
                 success: function(msg) {
                     alert(msg.status);
                 },
                 error: function(XMLHttpRequest, textStatus, errorThrown) {
                     alert(XMLHttpRequest.status);
                     alert(XMLHttpRequest.readyState);
                     alert(textStatus);
                 },
                 complete: function(XMLHttpRequest, textStatus) {
                	 form; // 调用本次AJAX请求时传递的options参数
                 }
   		   });
    	  })
        return false;
      });
  });
  
      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
	  
	  /* ---------- Map ---------- */
	$(function(){
	  $('#map').vectorMap({
	    map: 'world_mill_en',
	    series: {
	      regions: [{
	        values: gdpData,
	        scale: ['#000', '#000'],
	        normalizeFunction: 'polynomial'
	      }]
	    },
		backgroundColor: '#eef3f7',
	    onLabelShow: function(e, el, code){
	      el.html(el.html()+' (GDP - '+gdpData[code]+')');
	    }
	  });
	});



  </script>

  </body>
</html>
