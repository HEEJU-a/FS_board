<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공</title>
</head>
<body>
	<h1>등록에 성공하였습니다</h1>
	<a href="/board/list" onclick="popUp()">돌아가기</a>
</body>

	<script>
		function popUp(){
			opener.parent.location.reload();
			window.close();
		}
	</script>
</html>