package constructors;

import java.util.Locale;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: ");
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		
		ProductEntities p = new ProductEntities(name, price, quantity);
		
		p.setName("Computer");
		System.out.println("Updated name: " + p.getName());
		
		p.setPrice(1400.00);
		System.out.println("Updated price: " + p.getPrice());
		
		

		System.out.println();
		System.out.println("Updated data: " + p);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");

		quantity = sc.nextInt();
		p.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + p);

		sc.close();
	}
}
