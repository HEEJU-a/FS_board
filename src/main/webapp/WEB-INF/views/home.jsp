<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	메인입니다
</h1>
<c:choose>
	<c:when test="${empty sessionScope.loginUser}">
		<a href="user/login">로그인</a>
		<a href="user/join">회원가입</a>
	</c:when>
	<c:otherwise>
		<a href="user/logout">로그아웃</a>
	</c:otherwise>
</c:choose>
<a href="board/list?board_num=1">게시판</a>
<a href="board/listA?board_num=2">갤러리A</a>
<a href="board/listB?board_num=3">갤러리B</a>
</body>
</html>
