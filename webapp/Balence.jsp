<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Bankingapptestpage.BalanceBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Balance</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-image: url('https://images.unsplash.com/photo-1517832207067-4db24a2ae47c?auto=format&fit=crop&w=1950&q=80');
        background-size: cover;
        background-position: center;
        height: 100vh;
        color: white;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: rgba(0, 0, 0, 0.6);
        padding: 3rem;
        border-radius: 20px;
        text-align: center;
        box-shadow: 0 0 25px rgba(0,0,0,0.5);
        max-width: 600px;
    }

    h1 {
        font-size: 2.5rem;
        margin-bottom: 1rem;
        background: linear-gradient(90deg, #ff6ec4, #7873f5);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
    }

    p {
        font-size: 1.2rem;
        margin-bottom: 1rem;
    }

    a {
        text-decoration: none;
        padding: 0.8rem 1.5rem;
        background: linear-gradient(to right, #00c6ff, #0072ff);
        color: white;
        border-radius: 30px;
        font-weight: bold;
        transition: 0.3s ease;
    }

    a:hover {
        background: linear-gradient(to right, #0072ff, #00c6ff);
        box-shadow: 0 10px 20px rgba(0,0,0,0.3);
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Welcome Customer</h1>
        <p>
            <% 
                BalanceBean bb = (BalanceBean)session.getAttribute("abean");
                String msg = (String)request.getAttribute("msg");
                out.println("Customer Balance: ₹" + bb.getBalance() + "<br>");
                           %>
        </p>
        <a href="BankApp.jsp">Go to Bankapp Page</a>
    </div>
</body>
</html>
