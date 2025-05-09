<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Bankingapptestpage.BalanceBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Banking Message</title>
<style>
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-image: url('https://images.unsplash.com/photo-1521791136064-7986c2920216?auto=format&fit=crop&w=1950&q=80');
        background-size: cover;
        background-position: center;
        color: white;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background-color: rgba(0, 0, 0, 0.6);
        padding: 2rem 3rem;
        border-radius: 15px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.5);
        text-align: center;
        max-width: 600px;
    }

    h1 {
        font-size: 2rem;
        margin-bottom: 1rem;
        color: #ffd700;
    }

    p {
        font-size: 1.2rem;
        margin-bottom: 1.5rem;
    }

    a {
        padding: 10px 20px;
        background: linear-gradient(to right, #00f260, #0575e6);
        color: white;
        text-decoration: none;
        font-weight: bold;
        border-radius: 25px;
        transition: 0.3s;
    }

    a:hover {
        background: linear-gradient(to right, #0575e6, #00f260);
        transform: scale(1.05);
        box-shadow: 0 8px 16px rgba(0,0,0,0.3);
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Banking Message</h1>
        <p>
            <%
                BalanceBean ab = (BalanceBean)session.getAttribute("abean");
                String msg = (String)request.getAttribute("msg");
                out.println(msg);
            %>
        </p>
        <a href="BankApp.jsp">Go Back</a>
    </div>
</body>
</html>
