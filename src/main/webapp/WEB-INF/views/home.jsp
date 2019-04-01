<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
	<title>School List</title>
</head>
<body>
<c:forEach items="${list}" var="s">
	<h1>${s}</h1>
</c:forEach>
</body>
</html>
