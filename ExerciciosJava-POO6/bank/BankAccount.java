package bank;

public class BankAccount {
	
	private String clientName;
	private String accountNumber;
	private double balance;
	
	@Override
	public String toString() {
		String s = "";
		s += "Client Name: " + clientName;
		s += "; Account Number: " + accountNumber;
		s += "; Account Balance: " + balance;
		return s;
	}
	
	public boolean toWhithdraw(double value) {
		if((balance - value) >= 0) {
			balance -= value;
			return true;
		}
		return false;
	}
	
	public void toDeposite(double value) {
		balance += value;
	}
	
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
