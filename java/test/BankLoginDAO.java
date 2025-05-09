package test;
import java.sql.*;
public class BankLoginDAO 
{
	public LoginBean bb=null;
	public LoginBean login(String uN,String pW) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from BankApp where USENAME=? and password=?");
			ps.setString(1, uN);
			ps.setString(2, pW);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				bb =new LoginBean();
				bb.setUsername(rs.getString(3));
				bb.setPassword(rs.getString(4));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(bb);
		return bb;
		
	}

}
