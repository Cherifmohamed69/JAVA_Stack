<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login and Registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f7f7f7;
        }
        .auth-section {
            border-radius: 10px;
            padding: 20px;
            transition: transform 0.3s, box-shadow 0.3s;
            margin-bottom: 20px;
            background-color: #fff;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }
        .auth-section:hover {
            transform: translateX(5px);
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
        }
        .auth-section:not(:last-child) {
            margin-bottom: 20px;
        }
        .auth-title {
            font-size: 1.2rem;
            margin-bottom: 1.5rem;
        }
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #0056b3;
        }
        .btn-success {
            background-color: #28a745;
            border-color: #28a745;
        }
        .btn-success:hover {
            background-color: #1b712e;
            border-color: #1b712e;
        }
    </style>
</head>
<body>
   <div class="container">
        <div class="row justify-content-center mt-5">
            <!-- REGISTER A NEW USER  -->
            <div class="col-md-5 border rounded auth-section">
                <h3 class="auth-title">Register</h3>
                <form:form action="/register" method="post" modelAttribute="newUser">
                    <div class="form-group">
                        <label for="userName">User Name:</label>
                        <form:input path="userName" class="form-control" id="userName" />
                        <form:errors path="userName" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <form:input path="email" class="form-control" id="email" />
                        <form:errors path="email" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label for="password">Password:</label>
                        <form:password path="password" class="form-control" id="password" />
                        <form:errors path="password" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label for="confirm">Confirm Password:</label>
                        <form:password path="confirm" class="form-control" id="confirm" />
                        <form:errors path="confirm" class="text-danger" />
                    </div>
                    <input type="submit" value="Register" class="btn btn-primary" />
                </form:form>
            </div>

            <!-- LOGIN -->
            <div class="col-md-5 border rounded auth-section">
                <h3 class="auth-title">Login</h3>
                <form:form action="/login" method="post" modelAttribute="newLogin">
                    <div class="form-group">
                        <label for="loginEmail">Email:</label>
                        <form:input path="email" class="form-control" id="loginEmail" />
                        <form:errors path="email" class="text-danger" />
                    </div>
                    <div class="form-group">
                        <label for="loginPassword">Password:</label>
                        <form:password path="password" class="form-control" id="loginPassword" />
                        <form:errors path="password" class="text-danger" />
                    </div>
                    <input type="submit" value="Login" class="btn btn-success" />
                </form:form>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
