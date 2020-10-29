package in.conceptarchitect.banking.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import in.conceptarchitect.banking.Bank;
import in.conceptarchitect.banking.BankAccount;
import in.conceptarchitect.banking.SavingsAccount;
import in.conceptarchitect.banking.exceptions.InsufficientBalanceException;
import in.conceptarchitect.banking.exceptions.InvalidAccountNumberException;
import in.conceptarchitect.banking.exceptions.InvalidCredentialsException;

import static in.conceptarchitect.utils.CustomAsserts.*;

public class BankTests {
		BankAccount account;
		String name="hari";
		int toAccount;
		String toName="priya";
		String toPassword="pass";
		String correctPassword="pass";
		double balance=10000;
		double toBalance=20000;
		Bank bank;
		int sourceAccountNumber;
              int targetAccountNumber;
		@Before
		public void init() {
		bank = new Bank("icici",12);
		account=new BankAccount(name,correctPassword, balance);
		sourceAccountNumber = bank.openAccount("Savings",name,correctPassword, balance);
		targetAccountNumber = bank.openAccount("Savings",toName, toPassword, toBalance);
		}

	
	@Test(expected = InvalidAccountNumberException.class)
	public void transfer_shouldFailIfFromAccountDoesntExist() {
		bank.transfer(targetAccountNumber+1,10000 , "pass", sourceAccountNumber);
	}
	
	@Test(expected= InvalidAccountNumberException.class)
	public void transfer_shouldFailIfInvalidToAccount() {
		bank.transfer(targetAccountNumber, 20000,"pass" , toAccount);
	}
	
	@Test(expected= InvalidCredentialsException.class)
	public void transfer_shouldFailForInvalidPassword() {
	
		bank.transfer(targetAccountNumber, 2000, "yjh", sourceAccountNumber);
	}
	@Test(expected= InsufficientBalanceException.class)
	public void transfer_shouldFailForInsufficientBalance() {
		bank.transfer(targetAccountNumber, 1000000, "pass", sourceAccountNumber);
	}
	@Test
	public void transfer_shouldSucceedInHappyPath() {
		fail("Implement the logic here");
	}
	
	@Test
	public void creditInterest_creditsOneMonthOfInterest() {
		fail("Implement the logic here");
	}
	
	@Test
	public void closeAccount_failsForInvalidAccountNumber() {
		fail("Implement the logic here");
	}
	
	@Test
	public void closeAccount_cantWithdrawFromClosedAccount() {
		fail("Implement the logic here");
	}
	
	@Test
	public void openAccount_withSavingsTypeCreatesASavingAccount() {
		
		Bank bank=new Bank("bank name",1);
		
		bank.openAccount("savings", "someone", "somepassword", 1000);
		
		BankAccount account=bank.getAccount(1,"somepassword");
		
		assertType(SavingsAccount.class, account);
		
	}
	
	
	@Test
	public void openAccount_AssignsSequentialAccountNumber() {
		fail("Implement the logic here");
	}
	

}
