import java.util.Locale;
import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 

		double a, b, c, triangle, circle, trapeze, square, retangle, pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangle = a * c / 2.0;
		circle = pi * c * c;
		trapeze = (a + b) * c / 2.0;
		square = b * b;
		retangle = a * b;
		
		System.out.printf("TRIÂNGULO %.3f\n", triangle); 
		System.out.printf("CIRCULO %.3f\n", circle); 
		System.out.printf("TRAPEZIO %.3f\n", trapeze); 
		System.out.printf("QUADRADO %.3f\n", square); 
		System.out.printf("RETANGULO %.3f\n", retangle); 

		sc.close(); 

	}

}
