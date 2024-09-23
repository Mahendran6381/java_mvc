<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Page</title>
</head>
<body>
    <h1>Result</h1>
    <h1><%= session.getAttribute("result") %></h1>
</body>