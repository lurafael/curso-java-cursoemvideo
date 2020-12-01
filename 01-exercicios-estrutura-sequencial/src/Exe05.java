import java.util.Locale;
import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int pieceCode1, pieceNumber1, pieceNumber2, pieceCode2; 
		double pieceValue1, pieceValue2, result;

		pieceCode1 = sc.nextInt();
		pieceNumber1 = sc.nextInt();
		pieceValue1 = sc.nextDouble(); 
		pieceCode2 = sc.nextInt();
		pieceNumber2 = sc.nextInt();
		pieceValue2 = sc.nextDouble(); 

		result = pieceValue1 * pieceNumber1 + pieceValue2 * pieceNumber2;
		
		System.out.printf("VALOR A PAGAR = %.2f", result); 

		sc.close(); 

	}

}
