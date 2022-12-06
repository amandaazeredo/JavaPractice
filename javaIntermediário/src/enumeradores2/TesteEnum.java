package enumeradores2;

public class TesteEnum {

	public static void main(String[] args) {
		
		//para instanciar um enum nao se usa o new
		//enum pode ser comparadas com ==
		//enum podem implementar interfaces
		//pode ser declarado separadamente ou dentro da classe
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());




	}

}
