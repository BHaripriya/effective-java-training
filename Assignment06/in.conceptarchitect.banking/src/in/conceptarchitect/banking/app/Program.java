package in.conceptarchitect.banking.app;

import in.conceptarchitect.banking.BankAccount;
import in.conceptarchitect.utils.Input;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menuDrivenProgram();
		
		BankAccount a1=new BankAccount(1,"Vivek","p@ss", 10000,10);
		
		BankAccount a2= new BankAccount(1,"Vivek","p@ss", 10000,10);
		
		System.out.println("Interest rate for a1\t"+a1.getInterestRate());
		System.out.println("Interest rate for a2\t"+a2.getInterestRate());
		
		//it appears to change rate only for object "a1"
		// it is actually changing rate for everyone
		// Bad code! Unreadable
		//a1.setInterestRate(12); //unclear code
		
		//Logically clear code
		BankAccount.setInterestRate(12); //Oh! its changing for everone
		
		System.out.println("Interest rate for a1\t"+a1.getInterestRate());
		System.out.println("Interest rate for a2\t"+a2.getInterestRate());
	
		
		
	}

	private static void menuDrivenProgram() {
		BankAccount a1=new BankAccount(1, "Vivek","p@ss",20000,12);
		
		//a1.createAccount(1, "Vivek","p@ss",20000,12); //no need to call this line
		
		int choice=0;
		Input input=new Input();
		do {
			
			choice=input.readInt("1. Deposit\n2. Withdraw\n3.Credit Interst\n4.Show\n0.Exit\nChoose:");
			
			switch(choice) {
			case 1:
				a1.deposit();
				
				int amount=input.readInt("amount to deposit?");
				System.out.println("Amount deposited successfully");
				break;
			case 2:
				a1.withdraw();
				int amount1=input.readInt("amount to withdraw?");
				String password=input.readString("password");
				
				if(!password.equals(password)) {
					System.out.println("invalid credentials");
					return ;
				}else if(amount1<=0) {
					
					System.out.println("invalid denomination. please enter positive amount");
					
				} else if(amount1> amount1) {
					
					System.out.println("Insufficient Funds");
					
				}else {
					
					amount1-=amount1;
					System.out.println("please collect your cash");
					
				}
				break;
				
			case 3:
				a1.creditInterest();
				break;
				
			case 4:
				a1.show();
				System.out.println("Account Number\t");//this is not required 
				System.out.println("Name\t"); //this is not required
				System.out.println("Password\t"); //this is not required
				System.out.println("Balance\t"); //this is not required
				System.out.println("Interest Rate\t"); //this is not required
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid Input.Retry");
				
				
			}
			
			System.out.println("\n\n");
			
		}while(choice!=0);
	}

}
