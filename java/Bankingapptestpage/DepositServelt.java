package Bankingapptestpage;
import java.io.IOException;

import jakarta.annotation.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/depositservlet")
public class DepositServelt extends HttpServlet
{	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException
	{
		String accountNumber=req.getParameter("account");
		double amount=Double.parseDouble(req.getParameter("amount"));
		int k =new DepositDAO().depositAmount(accountNumber, amount);
		if(k>0) {
			req.setAttribute("msg", "Deposit Sucessfully.....");
		}
		else {
			req.setAttribute("msg", "Deposit failed,please check account number..");
		}
			req.getRequestDispatcher("Deposit.jsp").forward(req, res);	
	}

}
