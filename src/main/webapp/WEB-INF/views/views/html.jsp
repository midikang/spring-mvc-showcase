<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>My HTML View</title>
	<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		
</head>
<body>
<div class="success">
	<h3>user: "${user}"</h3>
	<h3>country: "${country}"</h3>
</div>
</body>
</html>