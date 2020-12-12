package exe01.rectangleApp;

import java.util.Locale;
import java.util.Scanner;

import exe01.entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");

		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n", rectangle.area());
		System.out.printf("AREA = %.2f\n", rectangle.perimeter());
		System.out.printf("AREA = %.2f", rectangle.diagonal());
		
		sc.close();
		
	}
	
}
