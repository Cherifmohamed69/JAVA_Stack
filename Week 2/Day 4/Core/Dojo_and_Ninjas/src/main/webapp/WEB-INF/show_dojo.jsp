<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dojo Information</title>
</head>
<body>
    <h2>Dojo Information</h2>
    <p>Dojo Name: ${dojo.name}</p>
    <h3>Ninjas in this Dojo:</h3>
    <ul>
        <c:forEach items="${dojo.ninjas}" var="ninja">
            <li>${ninja.name}</li>
        </c:forEach>
    </ul>
</body>
</html>
