package Bankingapptestpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.DBConnection;

public class WithdrawDAO 
{
	
public int withdrawamount(String Accountnumber,Double amount) 
{
	
//	BalanceBean wb = null;
	int k=0;

	System.out.println(Accountnumber+" : "+amount);
	try {
		Connection con = DBConnection.getCon();
		PreparedStatement ps1 = con.prepareStatement("SELECT balance FROM bankdetails WHERE Accountnumber = ?");
        ps1.setString(1, Accountnumber);
        ResultSet rs = ps1.executeQuery();
        if(rs.next())
        {
        	 double currentBalance = rs.getDouble("BALANCE");
        	 
        	 if(currentBalance >= amount)
        	 {
        		 double newBalance = currentBalance-amount;
        		  PreparedStatement ps2 = con.prepareStatement("UPDATE BankDetails SET balance =? WHERE Accountnumber = ?");
        		  ps2.setDouble(1, newBalance);
                  ps2.setString(2, Accountnumber);
                 k= ps2.executeUpdate();
                  
                  
//                  wb = new BalanceBean();
//                  wb.setAccountnumber(Accountnumber);
//                  wb.setBalance(newBalance);

        	 }
        	 else return 0;
        	 }

		
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("Withdraw dao k: "+k);
	return k;
        
        }     
	
}

