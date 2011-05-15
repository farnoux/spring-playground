<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="utf-8" />
  
  <title>Spring playground</title>
  
  <meta name="description" content="A list of articles">
  <meta name="author" content="farnoux">

  <link rel="stylesheet" href="<c:url value="/static/css/main.css" />" type="text/css" />
</head>
<body>

  <h1>Articles</h1>
  
  <ul>
    <c:forEach var="article" items="${articleList}">
      <li>${article.id} - ${article.title} - ${article.body}</li>
    </c:forEach>
  </ul>
  
</body>
</html>