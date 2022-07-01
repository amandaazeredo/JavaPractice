package entities.test;
import entities.ContaCorrente;
public class ContaTeste {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("12345");
		conta.setAgencia("123");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);
		conta.isValorEspecialUsado();
		System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente de = "+conta.getSaldo());
		}
		System.out.println("Tentando sacar 500 reais");
		saqueEfetuado = conta.realizarSaque(500);

		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente de = "+conta.getSaldo());
		}

		System.out.println("Depositando 500 reais: ");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}

		conta.realizarSaque(600);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
	}
}