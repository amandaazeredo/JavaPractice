package br.com.loiane.cursojava.aula57;

public class TesteWrapper {

	public static void main(String[] args) {
		
		//classes wrappers no java:
		
		Short num1 = new Short((short) 1);
		Byte num2 = new Byte((byte) 10);
		Integer num3 = new Integer(100);
		Long num4 = new Long(10000l);
		Float num5 = new Float(3.4f);
		Double num6 = new Double(3.5555);
		Boolean flag = new Boolean(true);
		Character b = new Character('b');
		
		Integer num13 = new Integer("100");
		
		Double num14 = new Double("3.5");
		
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue();
		
		int num16 = Integer.parseInt("100000");
		
		double num17 = Double.parseDouble("3.555");
		System.out.println(num17);
		
		Integer num18 = Integer.valueOf(1234);
		System.out.println(num18);
		
		System.out.println(num3 == num13);//operadores de igualdade não funcionam com wrappers
		
		
		
		
	}

}
