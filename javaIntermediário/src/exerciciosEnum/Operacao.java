package exerciciosEnum;

public enum Operacao {

	SOMA("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	}, SUBTRACAO("-") {
		@Override
		public double executarOperacao(double x, double y) {
		return x - y;
		}
	}, DIVISAO("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x/y;
		}
	}, MULTIPLICACAO("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x*y;
		}
	};

	private String simbolo;
	
	Operacao(String simbolo){
		this.simbolo = simbolo;
	}
	
	public abstract double executarOperacao(double x, double y);
	
	@Override
	public String toString() {
		return this.simbolo;
	}
	
	public static void main(String[] args) {
		double x = 2.0;
		double y = 3.0;
		
		for(Operacao op : Operacao.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
			
		}
	}
}
