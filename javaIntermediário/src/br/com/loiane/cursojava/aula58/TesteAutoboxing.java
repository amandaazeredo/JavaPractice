package br.com.loiane.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		
		Short num1 = 1;
		Byte num2 = 10;
		Integer num3 = 100;
		Long num4 =10000l;
		Float num5 =3.4f;
		Double num6 =3.5555;
		Boolean flag =true;
		Character b1 ='b';
		
		//auto un-boxing - tranforma um tipo de uma classe em um tipo primitivo.
		int num7 = num3; 
		
		//autoboxing em expressões
		num3++;
		
		System.out.println(num3);
		
		//auto un-boxing num3 -> autoboxing num7/num3 -> num8
		Integer num8 = num7/num3;
				
		//mau uso - se precisarmos m esses dados
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;

		Double media = (a+b+c)/3;
		System.out.println(media);
	}

}
