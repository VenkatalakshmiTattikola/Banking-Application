package Bankingapptestpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.DBConnection;

public class BalanceDAO 
{
BalanceBean bb=null;
public BalanceBean getBalance(String Accountnumber,String phonenumber ) 
{ try {
	System.out.println("Account No-"+Accountnumber);
	Connection con=DBConnection.getCon();
	PreparedStatement ps=con.prepareStatement("select * from Bankdetails where Accountnumber = ?");
	ps.setString(1, Accountnumber);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		bb=new BalanceBean();
		bb.setBalance(rs.getDouble("BALANCE"));
		
		System.out.println("bal="+bb.getBalance());
	}
	
}catch(Exception e) {
	e.printStackTrace();
}
	
	
	
	return bb;
	
}

}
