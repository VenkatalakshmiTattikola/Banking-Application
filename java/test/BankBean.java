package test;
import java.io.*;
@SuppressWarnings("serial")
public class BankBean  implements Serializable
{
	private String FullName,Email,Username,Password,CPword;
	public BankBean(){}
	public BankBean(String fullName, String email, String username, String password, String cPword) {
		super();
		FullName = fullName;
		Email = email;
		Username = username;
		Password = password;
		CPword = cPword;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCPword() {
		return CPword;
	}
	public void setCPword(String cPword) {
		CPword = cPword;
	}
	

}
