package bank;

public class SpecialAccount extends BankAccount {

	private double limit;

	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Special Account [limit =" + limit + "] " + super.toString();
	}
	
	public boolean toWithdraw(double value) {
		double balanceWithLimit = this.getBalance() + limit;
		if((balanceWithLimit-value) >= 0) {
			 this.setBalance(this.getBalance() - value);
			 return true;
		}
		return false;
	}
	
	
}

