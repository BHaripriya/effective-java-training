package in.conceptarchitect.banking;

import in.conceptarchitect.utils.Input;

public class BankAccount {
	
	private static final double amount = 0;
	int accountNumber;
	String name;
	String password;
	double balance;
	static double interestRate;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//you can't change your account number
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	//balance
	public double getBalance() {
		return balance;
	}
	
	//no set balance. to set balance use deposit or withdraw
	
	//get set interest rate
	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		BankAccount.interestRate = interestRate;
	}

	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	

	public  BankAccount(int accountNumber, String name, String password, double amount, double rate) {
		createAccount(accountNumber, name, password,amount, rate);
	}
	
	
	//I don't want anyone else calling this function
	private void createAccount(int accountNumber, String name, String password, double amount, double rate) {

		this.accountNumber=accountNumber;
		this.name=name;  //this.name is class field, name is argument
		this.password=password;
		
		this.balance=amount; //this is not required as balance has no conflict
		interestRate=rate;   //this is not required
	}
	
	public void show() {
		
	}
	
	public void deposit() {		
		
		if(amount>0) {
			balance+=amount;
		}	
		
	}

	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void creditInterest() {
		// TODO Auto-generated method stub
		balance+=(balance*interestRate)/1200; //one month interest at a time.
	}

}
