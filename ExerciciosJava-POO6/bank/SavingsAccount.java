package bank;

import java.util.Calendar;

public class SavingsAccount extends BankAccount {

	private int accountIncomeDay;
	
	public int getAccountDayIncome() {
		return accountIncomeDay;
	}
	public void setAccountIncome(int accountIncomeDay) {
		this.accountIncomeDay = accountIncomeDay;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += "Income Day: " + accountIncomeDay + "; ";
		s += super.toString();
		return s;
	}
	
	public boolean calculateNewBalance(double IncomeTax) {
		Calendar today = Calendar.getInstance();
		
		if(accountIncomeDay == today.get(Calendar.DAY_OF_MONTH)) {
			super.setBalance(this.getBalance() + this.getBalance() * IncomeTax);
			return true;
		} else {
			return false;
		}
	}
}