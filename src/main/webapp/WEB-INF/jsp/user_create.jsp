<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1><spring:message code="content.create" /></h1>
<a href="<spring:url value="/user_list.html" />"><spring:message code="content.list" /></a>
<form:form method="POST" action="/user_create.html" modelAttribute="form">
    <form:errors path="" element="div" />
    <div>
        <form:label path="id"><spring:message code="content.id" /></form:label>
        <form:input path="id" />
        <form:errors path="id" />
    </div>
    <div>
        <form:label path="contents1"><spring:message code="content.contents1" /></form:label>
        <form:contents path="contents1" />
        <form:errors path="contents1" />
    </div>
    <div>
        <form:label path="contents1"><spring:message code="content.password2" /></form:label>
        <form:contents path="password2" />
        <form:errors path="password2" />
    </div>
    <div>
        <input type="submit" />
    </div>
</form:form>
</body>
</html>