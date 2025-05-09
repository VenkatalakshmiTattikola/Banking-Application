package Bankingapptestpage;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.annotation.*;
@SuppressWarnings("seril")
@WebServlet("/balenceservlet")


public class BalanceServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
			throws IOException,ServletException{
		
	String accountNumber=req.getParameter("account");
	String ifscode=req.getParameter("ifsc");
	String phoneNo=req.getParameter("phoneno");
	String CustomerNumber=req.getParameter("custname");
	BalanceBean bb=new BalanceDAO().getBalance(accountNumber,phoneNo);
	if(bb==null) {
		req.setAttribute("msg", "inavlide account number....");
		req.getRequestDispatcher("balancefail.jsp").forward(req, res);
	}
	else {
		HttpSession hs=req.getSession();
		hs.setAttribute("abean", bb);
		req.setAttribute("msg", "your balance is:");
		req.getRequestDispatcher("Balence.jsp").forward(req, res);}
	
	
	}

}
