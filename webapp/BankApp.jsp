<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.LoginBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Banking Application</title>
<style>
body {
    background: url('https://img.freepik.com/premium-vector/banking-finance-concept-illustration_387612-169.jpg?semt=ais_hybrid') no-repeat center center fixed;
    background-size: cover;
    text-align: center;
    color: white;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
}

.container {
    background: rgba(255, 255, 255, 0.1);
    padding: 20px;
    border-radius: 15px;
    display: flex;
    justify-content: center;
    gap: 15px;
    box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);
}

h2 {
    font-size: 32px;
    font-weight: bold;
    text-shadow: 2px 2px 10px rgba(0, 0, 0, 0.5);
    margin-top:10px;
}

a {
    text-decoration: none;
    color: white;
    background: linear-gradient(to right, #6a11cb, #2575fc);
    padding: 12px 20px;
    border-radius: 25px;
    display: inline-block;
    font-size: 18px;
    font-weight: bold;
    transition: transform 0.2s ease-in-out, opacity 0.2s;
}

a:hover {
    opacity: 0.8;
    transform: scale(1.1);
}
</style>
</head>
<body>
    <h2>Banking Application</h2>
    <%
 LoginBean ab= (LoginBean) session.getAttribute("bbean");
out.println("Welcome "+ab.getUsername());
 %>
    <div class="container">
        <a href="Balance.html">Balance</a>
        <a href="Deposit.html">Deposit</a>
        <a href="Withdraw.html">Withdraw</a>
        <a href="Transfer.html">Transfer Money</a>
        <a href="CloseAccount.html">Close Account</a>
        <a href="About.jsp">About</a>
    </div>
</body>
</html>