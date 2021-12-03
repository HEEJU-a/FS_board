<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>writeA</title>
</head>
<body>
	<form action="writeA" method="post" enctype="multipart/form-data">
		<input type="hidden" id="iuser" name="iuser" value="${loginUser.getIuser()}">
	 	<input type="hidden" id="nm" name="nm" value="${loginUser.getNm()}">
	    <div><input type="text" id="title" name="title" placeholder="제목"></div>
	    <div><textarea name="ctnt" id="ctnt" placeholder="내용"></textarea> </div>
	   	<div><input type="file" name="file"></div>
	    <div>
	        <input type="submit" id="cInput" value="등록">
	        <input type="reset" value="새로작성">
	    </div>
	</form>
</body>
</html>