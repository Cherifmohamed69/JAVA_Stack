<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Daikichi Routes App</title>
    <!-- Add Bootstrap CSS link -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="display-4">Welcome to Daikichi Routes App</h1>
        <p class="lead">Click below to get your predictions:</p>
        <ul class="list-group">
            <li class="list-group-item"><a href="daikichi/travel/kyoto">Travel Prediction</a></li>
            <li class="list-group-item"><a href="daikichi/lotto/8">Lotto Prediction (Even)</a></li>
            <li class="list-group-item"><a href="daikichi/lotto/7">Lotto Prediction (Odd)</a></li>
        </ul>
    </div>

    <!-- Add Bootstrap JS scripts (Popper.js is required for dropdowns) -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
