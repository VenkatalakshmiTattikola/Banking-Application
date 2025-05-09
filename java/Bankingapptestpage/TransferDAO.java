package Bankingapptestpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.DBConnection;

public class TransferDAO {
	public Boolean transfermoney(String senderAccount,String recevierAccount,double amount) 
	{
	
		try {
			  Connection con = DBConnection.getCon();
    		    
              PreparedStatement ps1 = con.prepareStatement("SELECT Balance FROM Bankdetails WHERE Accountnumber = ?");
              ps1.setString(1, senderAccount);
              ResultSet rs1 = ps1.executeQuery();
              

              if (rs1.next())
              {
            	  
            	  ps1.setString(1, recevierAccount);
            	  ResultSet rs2 = ps1.executeQuery();
            	  
            	  if(rs2.next()) {
            		  
                	  PreparedStatement ps2 = con.prepareStatement("UPDATE Bankdetails SET balance = balance+? WHERE Accountnumber = ?");
                	  ps2.setDouble(1, -amount);
                      ps2.setString(2, senderAccount);
                     int k = ps2.executeUpdate();
                
                      ps2.setDouble(1, amount);
                      ps2.setString(2, recevierAccount);
                       int s=   ps2.executeUpdate();
                   System.out.println("k::"+k+" s::"+s);
                   if(k>0 && s>0) {
                	return true;
                   }
     
            	  }
            	  
            

              }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
	}

}
