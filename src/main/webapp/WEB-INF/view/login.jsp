<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Trang đăng nhập</title>
</head>
<body>
<h1 class="text-center massage">${mss}</h1>
<form action="/home" method="post">
    <label>UserName:</label><br>
    <input type="text" name="username">
    <br>
    <nav class="massage">${mess1}</nav>
    <br>
    <label>Password:</label><br>
    <input type="password" name="password">
    <br>
    <nav class="massage">${mess2}</nav>
    <br>
    <button type="submit">Login</button>
</form>
</body>
</html>