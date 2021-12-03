<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mod</title>
</head>
<body>
	<form action="mod" method="post">
		<div><input type="hidden" name="iboard" value="${param.iboard}"></div>
	    <div><input type="text" id="title" name="title" value="${data.title}" placeholder="제목"></div>
	    <div><textarea name="ctnt" id="ctnt"placeholder="내용">${data.ctnt}</textarea> </div>
	    <div>
	        <input type="submit" value="수정하기" >
	    </div>
	</form>
</body>
</html>