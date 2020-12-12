package stock.stockApp;

import java.util.Locale;
import java.util.Scanner;

import stock.stockEntities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product;
		product = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();

		// Toda classe em Java é uma subclasse da classe
		// Object(Tipo os elementos HTML em JS que herdam do objeto Element)
		// Então as classes em Java, herdam os seguintes métodos:

		// getClass = Retorna o tipo do objeto
		// equals = compara se o objeto é igual ao outro
		// hashCode = retorna um código hash do objeto
		// toString = converte o objeto para string

		System.out.println();
		System.out.println("Product data: " + product); // Chama o product.toString() - Explicação na classe Product

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();

	}
}
