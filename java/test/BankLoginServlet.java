package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/bank")
public class BankLoginServlet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		String uN=req.getParameter("username");
		String pW=req.getParameter("password");
		System.out.println(uN+" "+ pW);
		LoginBean bb=new BankLoginDAO().login(uN, pW);
		if(bb==null) {
			req.setAttribute("msg","inavlide login process...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else {
			HttpSession hs=req.getSession();
			hs.setAttribute("bbean", bb);
			req.getRequestDispatcher("BankApp.jsp").forward(req, res);
			}
	}

}
