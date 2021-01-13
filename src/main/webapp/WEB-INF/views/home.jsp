<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<!DOCTYPE html>

<html>
<head>
	<title>나의 그림들</title>
</head>
<body>
<h1>
	나의 그림 리스트~
</h1>
<table width="500" border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>날짜</th>	
	</tr>
	<c:forEach items="${list}" var="vo">
	<tr>
		<td>${vo.board_num}</td>
		<td>${vo.board_title}</td>
		<td><fmt:formatDate value="${vo.board_date}" dateStyle="full" /></td>
	</tr>
	</c:forEach>
</table>
<div><input id="write" onclick="location.href='write_view'" type="button" value="글작성"/></div>
</body>
</html>
