<!DOCTYPE html>
<html>
<head>
    <title>Omikuji Form</title>
    <link rel="stylesheet" type="text/css" href="/static/style.css" />
</head>
<body>
    <h1>Omikuji Form</h1>
    <form action="/omikuji/process" method="post">
        <label for="question">Enter your question:</label>
        <input type="text" id="question" name="question" required />
        <button type="submit">Send</button>
    </form>
</body>
</html>
