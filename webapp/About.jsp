<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Our Bank</title>
    <style>
        /* General Styling */
        body {
            font-family: 'Arial', sans-serif;
           background: linear-gradient(to right, #0b3d91, #1e5799, #f1c40f); /* Dark Blue to Gold */
            color: white;
            margin: 0;
            padding: 0;
        }
        
        /* Header Styling */
        .header {
            background-color: rgba(0, 0, 0, 0.6); /* Dark Transparent */
            color: white;
            padding: 20px;
            text-align: center;
            font-size: 24px;
            font-weight: bold;
        }

        /* Main Content */
        .container {
            max-width: 900px;
            margin: 30px auto;
            padding: 20px;
            background: rgba(255, 255, 255, 0.9); /* Semi-Transparent White */
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
            text-align: center;
            color: #333;
        }

        h1 {
            color: #0b3d91; /* Dark Blue */
            margin-bottom: 10px;
        }

        h2 {
            color: #ff8c00; /* Orange */
            border-bottom: 2px solid #ff8c00;
            display: inline-block;
            padding-bottom: 5px;
        }

        p {
            font-size: 18px;
            line-height: 1.6;
            margin-bottom: 15px;
        }

        .services {
            text-align: left;
            margin-top: 20px;
        }

        .services ul {
            list-style: none;
            padding: 0;
        }

        .services ul li {
            background: #e0e0e0;
            padding: 12px;
            border-radius: 5px;
            margin: 5px 0;
            font-size: 17px;
            font-weight: bold;
        }

        .contact {
            margin-top: 20px;
            font-size: 16px;
            font-weight: bold;
        }

        /* Back Button */
        .back-btn {
            margin-top: 20px;
        }

        .back-btn a {
            text-decoration: none;
            color: white;
            background-color: #ff8c00; /* Orange */
            padding: 12px 25px;
            border-radius: 5px;
            font-size: 18px;
            font-weight: bold;
            transition: 0.3s;
        }

        .back-btn a:hover {
            background-color: #cc7000; /* Darker Orange */
        }
    </style>
</head>
<body>

    <div class="header">Welcome to Our  venky's Bank</div>

    <div class="container">
        <h1>About Our Bank</h1>
        <p>Welcome to <b>Our Bank</b>, a leading financial institution dedicated to offering secure, reliable, and innovative banking solutions.</p>
        <p>We provide top-notch banking services including savings, loans, investments, and more.</p>

        <h2>Our History</h2>
        <p>Founded in 1990, Our Bank has built a strong reputation for trust and financial excellence. With a growing network of branches and digital banking solutions, we continue to serve millions worldwide.</p>

        <h2>Our Services</h2>
        <div class="services">
            <ul>
                <li>✔ 24/7 Secure Online Banking</li>
                <li>✔ Fast & Easy Money Transfers</li>
                <li>✔ High-Interest Savings Accounts</li>
                <li>✔ Low-Interest Loans & Credit</li>
                <li>✔ Premium Customer Support</li>
            </ul>
        </div>

        <h2>Contact Us</h2>
        <div class="contact">
            <p>Email: <b>support@Ourbank.com</b></p>
            <p>Phone: <b>+1 800 123 4567</b></p>
            <p>Address: <b>123 Bank Street, Financial City, USA</b></p>
        </div>

        <div class="back-btn">
            <a href="BankApp.jsp">Back to Home</a>
        </div>
    </div>

</body>
</html>