<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	PRODUITS 
</h1>

<c:forEach items="${cat}" var="cat">

<p>${cat.description}</p> 

</c:forEach>  
</body>
</html>
