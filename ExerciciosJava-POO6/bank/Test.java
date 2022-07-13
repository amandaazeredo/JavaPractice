package bank;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("*** BANK ACCOUNT TEST ***");
		
		BankAccount testBankAccount = new BankAccount();
		testBankAccount.setClientName("Client1");
		testBankAccount.setAccountNumber("11111");
		
		System.out.println("Do you want to deposite and/or withdraw an amount? (y/n)");
		String answerBankAccount = sc.next();
		
		if(answerBankAccount.equalsIgnoreCase("y")) {
		changeBalance(testBankAccount, sc, 0);
		} else if(answerBankAccount.equalsIgnoreCase("n")) {
			System.out.println(testBankAccount);
		} else {
			System.out.println("error");
		}
	
	System.out.println("*** SAVINGS ACCOUNT TEST ***");
	
	SavingsAccount testSavingsAccount = new SavingsAccount();
	testSavingsAccount.setClientName("Client2");
	testSavingsAccount.setAccountNumber("22222");
	testSavingsAccount.setAccountIncome(13);
	
	System.out.println("Do you want to deposite and/or withdraw an amount? (y/n)");
	String answerSavingsAccount = sc.next();
	
	if(answerSavingsAccount.equalsIgnoreCase("y")) {
	changeBalance(testSavingsAccount, sc, 0);
	} else if(answerSavingsAccount.equalsIgnoreCase("n")) {
		System.out.println(testSavingsAccount);
	} else {
		System.out.println("error");
	}
	
	if(testSavingsAccount.calculateNewBalance(0.05)) {
		System.out.println("Income applied! New balance = " + testSavingsAccount.getBalance());
	} else {
		System.out.println("Today is not income day, new balance has not been calculated!");
	}
	
	System.out.println("*** SPECIAL ACCOUNT TEST ***");
		
		SpecialAccount testSpecialAccount = new SpecialAccount();
		testSpecialAccount.setClientName("Client3");
		testSpecialAccount.setAccountNumber("33333");
		testSpecialAccount.setLimit(50);
		
		System.out.println("Do you want to deposite and/or withdraw an amount? (y/n)");
		String answerSpecialAccount = sc.next();
		
		if(answerSpecialAccount.equalsIgnoreCase("y")) {
		changeBalance(testSpecialAccount, sc, 0);
		} else if(answerSpecialAccount.equalsIgnoreCase("n")) {
			System.out.println(testSpecialAccount);
		} else {
			System.out.println("error");
		}
}

		protected static void changeBalance(BankAccount test, Scanner sc, double valor) {
			System.out.println("Enter a deposite amount");
			test.toDeposite(sc.nextDouble());
			System.out.println("Enter a withdraw amount");
			double withdrawAmount = sc.nextDouble();
			test.toWhithdraw(withdrawAmount);
			
			if(withdrawAmount < test.getBalance()) {
				System.out.println("Successful Withdrawal! Now your Balance is = " + test.getBalance());
			} else {
				System.out.println("Withdrawal Denied! Insufficient Balance for withdraw $" +withdrawAmount+ ". Your Balance is = "+ test.getBalance());
			}
			System.out.println(test);
			
		}
		
}

