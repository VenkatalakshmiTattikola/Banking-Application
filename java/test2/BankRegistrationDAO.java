package test2;
import java.sql.*;

import test.BankBean;
import test.DBConnection;
import test.LoginBean;
public class BankRegistrationDAO {
	public BankBean bb=null;
	int k=0;
	public int registration(BankBean bb) 
	{
		
try {
	Connection con=DBConnection.getCon();
	PreparedStatement ps=con.prepareStatement("insert into  Bankapp values(?,?,?,?)");
	
	ps.setString(1, bb.getFullName());
	ps.setString(2, bb.getEmail());
	ps.setString(3, bb.getUsername());
	ps.setString(4, bb.getPassword());
	k=ps.executeUpdate();
	
} catch(Exception e) {
	e.printStackTrace();
}
return k;
}
}
