<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<style>
	.cursor{cursor:pointer;}
</style>
</head>
<body>
	<a href="/">홈</a>
	<c:if test="${not empty sessionScope.loginUser}">
		<input type="button" value="글쓰기" onclick="openChild()">
		<a href="/user/logout">로그아웃</a>
		<h1>'${loginUser.nm}'님 환영합니다</h1>
	</c:if>
	
	<table>
		<tr>
			<th>번호</th>
	        <th>제목</th>
	        <th>글쓴이</th>
	        <th>조회수</th>
	        <th>작성일시</th>
		</tr>
			
		<c:forEach items="${requestScope.list}" var="item">
			<tr class="cursor" onclick="moveToDetail(${item.iboard});">
				<td>${item.iboard}</td>
				<td>${item.title}</td>
				<td>${item.nm}</td>
				<td>${item.views}</td>
				<td>${item.regdt}</td>
			</tr>
		</c:forEach>		
	</table>
	<div>>
		<c:forEach begin="1" end="${requestScope.maxPageVal}" var="page">
	        <c:choose>
	            <c:when test="${(empty param.page && page eq 1) || param.page eq page}">
	                <span class="selected">${page}</span>
	            </c:when>
	            <c:otherwise>
	                <span><a href="list?page=${page}&recordCnt=${param.recordCnt == null ? 10 : param.recordCnt}">${page}</a></span>
	            </c:otherwise>
	        </c:choose>
    	</c:forEach>
	</div>
	<div>
	    <form action="list" method="get">
	    	<input type="hidden" name="page" value="1">
	    	<select name="recordCnt">
	    		<option value="10">10</option>
	    		<option value="20">20</option>
	    		<option value="30">30</option>
	    		<option value="30">40</option>
	    	</select>
	    	<input type="submit" value="검색">
	    </form>	    
	</div>
	<div>
		<form action="list" method="post">
			<div>
				<select name="searchType">
					<option value="1"${param.searchType == 1 ? 'selected': ''}>전체</option>
					<option value="2"${param.searchType == 2 ? 'selected': ''}>제목</option>
					<option value="3"${param.searchType == 3 ? 'selected': ''}>내용</option>
					<option value="4"${param.searchType == 4 ? 'selected': ''}>작성자</option>
				</select>
				<input type="search" name="searchText" value="${param.searchText}">
				<input type="submit" value="검색">
			</div>
		</form>
	</div>

	<script type="text/javascript">
		function moveToDetail(iboard){
		location.href='detail?iboard=' + iboard;
		}
		function openChild(){
			var openWin = window.open('http://localhost:8080/board/write', '글쓰기 팝업', 'width=700px,height=800px');
		}
	</script>
</body>
</html>