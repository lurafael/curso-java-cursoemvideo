import java.util.Locale;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Define como padr�o americano
		Scanner sc = new Scanner(System.in); // Aloca mem�ria

		double pi, radius, area;

		pi = 3.14159;
		radius = sc.nextDouble(); // Espera um double do teclado e atribui a radius
		area = pi * radius * radius;

		System.out.printf("A = %.4f", area); // Imprime a �rea formatada com 4 casas decimais ap�s o "."

		sc.close(); // Libera a mem�ria alocada
		
	}
}
