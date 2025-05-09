<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Withdraw Result</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdePk-twVcSqhYnNzVJo2ivYoSwDNg3T9LaQ&s');
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        color: white;
    }

    .container {
        background-color: rgba(0, 0, 0, 0.75);
        padding: 30px 40px;
        border-radius: 12px;
        box-shadow: 0 0 12px rgba(0, 0, 0, 0.5);
        text-align: center;
        max-width: 500px;
    }

    p {
        font-size: 1.4rem;
        color: #00ffc3;
        margin-bottom: 25px;
    }

    a {
        display: inline-block;
        padding: 12px 24px;
        background: linear-gradient(to right, #00c6ff, #0072ff);
        color: white;
        text-decoration: none;
        border-radius: 25px;
        font-weight: bold;
        transition: all 0.3s ease;
    }

    a:hover {
        background: linear-gradient(to right, #0072ff, #00c6ff);
        transform: scale(1.05);
    }
</style>
</head>
<body>
    <div class="container">
        <%
          String msg = (String)request.getAttribute("message");
          out.println("<p>" + msg + "</p>");
        %>
        <a href="withdraw.html">Go Back</a>
    </div>
</body>
</html>
