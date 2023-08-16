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
    <title>New Ninja</title>
</head>
<body>
    <h2>Create a New Ninja</h2>
    <form action="/ninjas" method="post">
        <label for="name">Ninja Name:</label>
        <input type="text" id="name" name="name" required>
        <label for="dojo">Choose Dojo:</label>
        <select id="dojo" name="dojo.id" required>
            <c:forEach items="${dojos}" var="dojo">
                <option value="${dojo.id}">${dojo.name}</option>
            </c:forEach>
        </select>
        <button type="submit">Create</button>
    </form>
</body>
</html>
