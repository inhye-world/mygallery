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
<form:form action="/upload" method="POST" enctype="multipart/form-data">
	<input type="file" name="data">
	<input type="submit" value="꼬~~우!">
</form:form>
</body>
</html>
