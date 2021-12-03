<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

<h1>로그인페이지</h1>
<div>${requestScope.errMsg}</div>
	<form action="login" method="post">
		<div><input type="text" name="id" placeholder="아이디"></div>
		<div><input type="password" name="pw" placeholder="비밀번호"></div>
		<div><input type="submit" value="로그인"></div>
	</form>
</body>
</html>