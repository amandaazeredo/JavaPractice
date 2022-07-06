package CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Money {
	
	static double dollar;
	static double bought;


	public static void main(String[] args) {

		Locale.setDefault(Locale.CANADA);
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		dollar = in.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		bought = in.nextDouble();
		
		System.out.printf("Amount to be paid in real: %.2f%n", payment(0));
		 in.close();
		
	}

	public static double payment (double money) {
		return dollar * bought;
}
	}
