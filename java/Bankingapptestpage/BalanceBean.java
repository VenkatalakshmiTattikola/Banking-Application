package Bankingapptestpage;

public class BalanceBean 
{
private String ifscode;
private String accountnumber;
private String phonenumber;
private String customerName;
private double balance;
public BalanceBean() {
	super();
}

public BalanceBean(String ifscode, String accountnumber, String phonenumber, String customerName, double balance) {
	super();
	this.ifscode = ifscode;
	this.accountnumber = accountnumber;
	this.phonenumber = phonenumber;
	this.customerName = customerName;
	this.balance = balance;
}

public String getIfscode() {
	return ifscode;
}
public void setIfscode(String ifscode) {
	this.ifscode = ifscode;
}
public String getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}


}
