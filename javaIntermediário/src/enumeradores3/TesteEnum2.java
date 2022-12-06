package enumeradores3;

import enumeradores.DiaSemana;

public class TesteEnum2 {
	
	public static void main(String[] args) {
		DiaSemana dia;
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia2 = Enum.valueOf(DiaSemana.class, "DOMINGO");
		System.out.println(dia2);
	}

	

}
