<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Chattle Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--bootstrap-->
<link href="../../static/css/bootstrap.css" rel="stylesheet" type="text/css" />
<!--coustom css-->
<link href="../../static/css/style.css" rel="stylesheet" type="text/css" />
<!--default-js-->
<script src="/BaseWebProject/static/js/jquery-2.1.4.min.js"></script>
<!--bootstrap-js-->
<script src="../../static/js/bootstrap.js"></script>

<script src="../../static/js/responsiveslides.min.js"></script>

<script type="text/javascript">
	
</script>
<script type="text/javascript">
function insert() {
	$.ajax({
		url:"insert",
		success:function(data) {
			alert(data);
		}
	});
}
</script>
</head>
<body>
hello Freemarker!
<button onclick="insert()"> insert </button>
</body>
</html>