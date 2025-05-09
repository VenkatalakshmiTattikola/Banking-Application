<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Closure Status</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-image: url('https://images.unsplash.com/photo-1504384308090-c894fdcc538d?auto=format&fit=crop&w=1950&q=80');
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
        background-color: rgba(0, 0, 0, 0.7);
        padding: 30px 40px;
        border-radius: 15px;
        box-shadow: 0 0 15px rgba(0, 0, 0, 0.5);
        text-align: center;
        max-width: 500px;
    }

    p {
        font-size: 1.3rem;
        color: #00ffc3;
        margin-bottom: 20px;
    }

    a {
        display: inline-block;
        padding: 12px 24px;
        background: linear-gradient(to right, #00c6ff, #0072ff);
        color: white;
        text-decoration: none;
        border-radius: 30px;
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
        <a href="BankApp.jsp">Go back</a>
    </div>
</body>
</html>
