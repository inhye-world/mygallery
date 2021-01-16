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
	<thead>
		<tr>
			<td>제목</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="account" items="${accountTransactionList}" varStatus="status">
				<tr>
					<td class="test1">${account.dTitle}</td>
					<td class="test1"><javatime:format value="${account.tran_date_time}" pattern=" yyyy-MM-dd HH:mm:ss"/></td>	
				</tr>
		</c:forEach>
	</tbody>

</table>
</body>
</html>
