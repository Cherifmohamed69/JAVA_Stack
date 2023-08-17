<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<title>Book Share</title>
</head>
<body>

<div class="container mt-5">
    <h2 class="mb-4">Add a New Book</h2>
    <form:form action="/books/new" method="post" modelAttribute="bookName">
        <form:hidden path="user" value="${user.id}" />
        
        <div class="mb-3">
            <label for="title" class="form-label">Title:</label>
            <form:input path="title" id="title" class="form-control" />
            <form:errors path="title" class="text-danger" />
        </div>
        
        <div class="mb-3">
            <label for="author" class="form-label">Author:</label>
            <form:input path="author" id="author" class="form-control" />
            <form:errors path="author" class="text-danger" />
        </div>
        
        <div class="mb-3">
            <label for="thought" class="form-label">My Thoughts:</label>
            <form:textarea path="thought" id="thought" class="form-control" rows="3" cols="20" />
            <form:errors path="thought" class="text-danger" />
        </div>
        
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
