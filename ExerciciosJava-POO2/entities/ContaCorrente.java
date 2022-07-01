package entities;

public class ContaCorrente {

	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	private boolean valorEspecialUsado;
	
	public boolean realizarSaque(double quantiaASacar) {
		//tem saldo
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
			
		}else { //não tem saldo na conta
			if (especial) { //verfica se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
				
			} else {
				return false;
			}
		}
	}
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual da conta = "+ getSaldo());
	}
	
	public boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(boolean valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

}
