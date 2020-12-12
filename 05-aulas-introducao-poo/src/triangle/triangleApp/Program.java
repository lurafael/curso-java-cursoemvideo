package triangle.triangleApp;

import java.util.Locale;
import java.util.Scanner;

import triangle.triangleEntities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		O programa comentado era a forma que eu vinha fazendo
//		no decorrer do curso, da forma simples e tudo no mesmo
//		arquivo. Agora estamos repassando para o formato 
//		orientado a objetos.

//		double Xa, Xb, Xc;
//		double Ya, Yb, Yc;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
//		double p; 
		double areaX, areaY;
		
		System.out.println("Enter the measures of triangle X:");
//		Xa = sc.nextDouble();
//		Xb = sc.nextDouble();
//		Xc = sc.nextDouble();
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
//		Ya = sc.nextDouble();
//		Yb = sc.nextDouble();
//		Yc = sc.nextDouble();
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
//		p = (Xa + Xb + Xc) / 2.0;
//		areaX = Math.sqrt(p * (p - Xa) * (p - Xb) * (p - Xc));
		areaX = x.area();
		
//		p = (Ya + Yb + Yc) / 2.0;
//		areaY = Math.sqrt(p * (p - Ya) * (p - Yb) * (p - Yc));		
		areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY)
			System.out.println("Larger area: X");
		else
			System.out.println("Larger area: Y");
		
		sc.close();
	}
	
}