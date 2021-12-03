<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listA</title>
</head>
<body>
	<a href="/">홈</a>
	<c:if test="${not empty sessionScope.loginUser}">
		<input type="button" value="글쓰기" onclick="openWinA()">
		<a href="/user/logout">로그아웃</a>
		<h1>'${loginUser.nm}'님 환영합니다</h1>
	</c:if>
	
	<script>
	function openWinA(){
		var openWin = window.open('http://localhost:8080/board/writeA', '글쓰기 팝업', 'width=700px,height=800px');
	}
	</script>
</body>
</html>