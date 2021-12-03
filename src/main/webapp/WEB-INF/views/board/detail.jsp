<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>
	<div>글번호 : ${param.iboard}</div>
	<div>제목 : ${data.title} </div>
	<div>내용 : <c:out value="${requestScope.data.ctnt}"/></div>
	<div>글쓴이 : <c:out value="${data.nm}"/></div>
	<div>작성일 : ${data.regdt}</div>
	<c:if test="${sessionScope.loginUser.iuser == data.iuser}">
		<input type="button" value="수정" onclick="location.href='mod?iboard=${param.iboard}'">
		<input type="button" value="삭제" onclick="del(${param.iboard})">
	</c:if>

<!-- 	<input type="button" value="글 목록" onclick="location.href='board';"> -->
	<script>
		function del(iboard) {
			var chk = confirm("정말 삭제하시겠습니까?");
			if (chk) {
				location.href='delete?iboard='+iboard;
			}
		}	
	</script>
</body>
</html>