<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>greeting logged</title>
</head>
<body>

<h3>cześć  ${pageContext.request.remoteUser} </h3>


<form action="/logout" method="post">
    <input type="submit" value="logout" />
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</body>
</html>
