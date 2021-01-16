<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<!DOCTYPE html>

<html>
<head>
	<title>오늘의 그림</title>
</head>
<body>
<h2>아직은 연필화...</h2>
<table width="500" border="1">

<form:form class="modify" method="post">
<input type="hidden" name="board_num" value="${content.board_num}">
	<tr>
		<td>제목</td>
		<td><input id="board_title"	type="text" value="${content.board_title}"></td>
	</tr>
	
	<tr>
		<td>내용</td>
		<td><textarea id="board_content" name="board_content">${content.board_content}</textarea></td>
	</tr>
	<tr>
		<td colspan = "2">
			<input type="submit" value = "수정">
			<a href="delete?board_num=${content.board_num}">삭제</a>
		</td>
	</tr>
	</form:form>
</table>
<a href="home">목록보기</a>
</body>
</html>
