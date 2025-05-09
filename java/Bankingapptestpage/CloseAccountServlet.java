package Bankingapptestpage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/closeservlet")
public class CloseAccountServlet extends HttpServlet
{  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException
	       {
		String accountNumber = req.getParameter("account"); 
		int k= new CloseAccountDAO().closeAccount(accountNumber);
		System.out.println(k);
		if(k>0) {
			req.setAttribute("msg", "closed Sucessfully.....");
		}
		else {
			req.setAttribute("msg" ,"closing failed,please check account number..");
		}
		req.getRequestDispatcher("CloseAccount.jsp").forward(req, res);	
	}
		

}
