<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script
  src="https://code.jquery.com/jquery-3.6.3.slim.js"
  integrity="sha256-DKU1CmJ8kBuEwumaLuh9Tl/6ZB6jzGOBV/5YpNE2BWc="
  crossorigin="anonymous"></script>
</head>
<body>
	<h3>Ajax Test</h3>
	
	<script>
		$.ajax({
			type:"get"
			, url:"/ajax/request"
			//, data:{}
			, success: function(data) {
				alert(data.name);
				$("#text").text(data.age);
			}
			, error: function() {
				
			}
		});
	
	
	</script>

</body>
</html>