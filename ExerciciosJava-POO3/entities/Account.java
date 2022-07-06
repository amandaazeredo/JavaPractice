package entities;

public class Account {

	private int acnumb;
	private String name;
	private double valueDep;
	private double valueWithdrawed;
	
	
	public double getValuedep() {
		return valueDep;
	}
	public void setValuedep(double valuedep) {
		this.valueDep = valuedep;
	}
	public double getValuetaked() {
		return valueWithdrawed;
	}
	public void setValuetaked(double valuetaked) {
		this.valueWithdrawed = valuetaked;
	}
	public int getAcnumb() {
		return acnumb;
	}
	public void setAcnumb(int acnumb) {
		this.acnumb = acnumb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double valueplus(double dep2) {
		return valueDep = dep2 + valueDep; 
		
	}
	
	public double valueminus(double withdraw) {
		return valueWithdrawed = valueDep - withdraw - 5;
	}
	
	public String toString() {
		return "Account: " + acnumb + ", "
				+"Holder: " + name + ", "
				+ "Balance: " + "$ "
				+ String.format("%.2f", valueDep);
	}
	

	public String toString2() {
		return "Account: " + acnumb + ", "
				+"Holder: " + name + ", "
				+ "Balance: " + "$ "
				+ String.format("%.2f", valueWithdrawed);
	
	}
	
}
