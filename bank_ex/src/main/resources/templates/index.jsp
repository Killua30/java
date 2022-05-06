<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

</head>
<body>
<h1>We are glad to see you on the main page of our Bank_ex </h1>
<h2>To see your balance try path api/v1/clients/"p + your id"</h2>
<security:authorize access="hasAnyRole(Role.P2.name())">

</security:authorize>
<a href="/">Go Home</a>

</body>
</html>