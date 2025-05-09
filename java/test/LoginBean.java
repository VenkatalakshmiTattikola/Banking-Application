package test;

public class LoginBean {
	private String Username,Password,Email;
//eamil add 
	
	public LoginBean(String username, String password,String email) {
		super();
		Username = username;
		Password = password;
		Email=email;
	}
	
	LoginBean()
	{
		
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "LoginBean [Username=" + Username + ", Password=" + Password + ", Email=" + Email + "]";
	}

	
	

}
