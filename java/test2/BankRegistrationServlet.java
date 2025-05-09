package test2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import test.BankBean;
import test.LoginBean;
@SuppressWarnings("serial")
@WebServlet("/registeration")

public class BankRegistrationServlet extends HttpServlet 
{
	@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{	
	PrintWriter out =res.getWriter();
	String fullname=req.getParameter("fullname");
	String email=req.getParameter("email");
	String  uname=req.getParameter("username");
	String pword=req.getParameter("password");
    String cpword=req.getParameter("cf");
     if(!cpword.equals(pword)) {
	  out.println("pword and cpword must be matched...");
	
}else {
	BankBean ab=new BankBean(fullname,email,uname,pword,cpword);
	
    int k=new BankRegistrationDAO().registration(ab);
    if(k>0) {
    	out.println("success......");
    	req.getRequestDispatcher("home.html").forward(req, res);
    }
    else {
    	out.println("log in again......");
    }
		
	}
}
}
