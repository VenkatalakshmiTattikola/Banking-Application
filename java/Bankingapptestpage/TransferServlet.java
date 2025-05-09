package Bankingapptestpage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/transfermoneyservlet")
public class TransferServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException
	{
		String senderAccount = req.getParameter("sendAcc");
        String receiverAccount = req.getParameter("recAcc");
        double amount = Double.parseDouble(req.getParameter("amount"));
      Boolean flag = new TransferDAO().transfermoney(senderAccount, receiverAccount, amount);
        if (!flag) {
       	 req.setAttribute("message", "TransferMoney failed. Please check account number.");
         req.getRequestDispatcher("Transfer.jsp").forward(req, res);
       } else {
           req.setAttribute("message", "TransferMoney successful!");
           req.getRequestDispatcher("Transfer.jsp").forward(req, res);
       }
    

	}
}
