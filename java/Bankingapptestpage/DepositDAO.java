package Bankingapptestpage;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.DBConnection;

public class DepositDAO {
	int k;
	public int depositAmount(String Accountnumber,double amount)
	{
		try {
			System.out.println("account no"+Accountnumber);
			Connection con=DBConnection.getCon();
			PreparedStatement ps1 = con.prepareStatement("SELECT BALANCE FROM  Bankdetails WHERE Accountnumber = ?");
			ps1.setString(1, Accountnumber);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) {
				double newBalance=rs.getDouble(1)+amount;
				PreparedStatement ps2=con.prepareStatement("update Bankdetails set BALANCE = ? where  Accountnumber = ?");
				ps2.setDouble(1, newBalance);
				ps2.setString(2, Accountnumber);
			k = ps2.executeUpdate();
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return k;
		
	}
}
