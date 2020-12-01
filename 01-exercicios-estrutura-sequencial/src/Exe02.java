import java.util.Locale;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Define como padrão americano
		Scanner sc = new Scanner(System.in); // Aloca memória

		double pi, radius, area;

		pi = 3.14159;
		radius = sc.nextDouble(); // Espera um double do teclado e atribui a radius
		area = pi * radius * radius;

		System.out.printf("A = %.4f", area); // Imprime a área formatada com 4 casas decimais após o "."

		sc.close(); // Libera a memória alocada
		
	}
}
