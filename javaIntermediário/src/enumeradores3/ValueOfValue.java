package enumeradores3;

import enumeradores2.DiaSemana;

public class ValueOfValue {

	public static void main(String[] args) {
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		//com o for melhorado, mesmo resultado
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
	}

}
