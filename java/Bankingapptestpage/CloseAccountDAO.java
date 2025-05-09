package Bankingapptestpage;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.DBConnection;

public class CloseAccountDAO {
	int k = 0;
          
    public int closeAccount(String AccountNumber) {
        try {
        	System.out.println("Account Number "+AccountNumber);
        	Connection con=DBConnection.getCon();
			PreparedStatement ps1 = con.prepareStatement("DELETE  FROM bankdetails WHERE Accountnumber = ?");
			ps1.setString(1, AccountNumber);
			 k = ps1.executeUpdate();
            }
        catch(Exception e) {
        	e.printStackTrace();
        }
		return k;
}}