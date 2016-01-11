<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<body>
<h1><spring:message code="users.list" /></h1>
<ul>
    <c:forEach items="${userses}" var="users">
        <li>
            <c:out value="${users.getId()}" />
        </li>
    </c:forEach>
</ul>

<a href="<spring:url value="/user_create.html" />"><spring:message code="users.create" /></a>
</body>
</html>