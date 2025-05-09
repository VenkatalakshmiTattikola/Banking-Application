package Bankingapptestpage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/WithdrawServlet")

public class WithdrawServlet extends HttpServlet{
	@Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) 
    		throws ServletException,IOException
    {
    	String accountnumber=req.getParameter("accountnumber");
    	double amonut=Double.parseDouble(req.getParameter("amount"));
        int k = new WithdrawDAO().withdrawamount(accountnumber, amonut);
    	if (k>0) {
            req.setAttribute("message", " Withdraw successful!");
        } else {
            req.setAttribute("message", "Withdraw failed. Please check account number/ Insufficient Funds");
        }
        
        req.getRequestDispatcher("Withdraw.jsp").forward(req, res);
    }

    	
    	
    	
    }


