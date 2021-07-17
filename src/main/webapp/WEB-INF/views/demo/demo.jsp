<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/components/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo</title>
</head>
<body>
	<h2>Demo</h2>
	<c:forEach items="${listCat}" var="cat" >
		<p>${cat.id} - ${cat.name}</p>
	</c:forEach>
</body>
</html>