package entities.bank;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Cad {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);
		
		Scanner in = new Scanner(System.in);
		
		Account acc = new Account();
		
		System.out.println("South American Bank");
		System.out.println("Enter your account number: ");
		acc.setAcnumb(in.nextInt());
		
		System.out.println("Enter your name: ");
		String name = in.next();
		acc.setName(name);
		
		System.out.println("Is there an initial deposit (y/n)? ");
		String r = in.next();
		
		if (r.equals("y")) {
			System.out.printf("Enter an initial deposit value: ");
			double dep = in.nextDouble();
			acc.setValuedep(dep);
		}
		
		System.out.println("Account data: ");
		System.out.println(acc.toString());
				
			
		System.out.println("Enter a deposit value: ");
		double dep2 = in.nextDouble();
		acc.valueplus(dep2);
			
		System.out.println("Updated data: ");
		System.out.println(acc.toString());
			
		System.out.println("Enter a withdraw value: ");
		double withdraw = in.nextDouble();
		acc.valueminus(withdraw);
		
		System.out.println("Updated data: ");
		System.out.println(acc.toString2());
		
		in.close();
		
		}

	}


