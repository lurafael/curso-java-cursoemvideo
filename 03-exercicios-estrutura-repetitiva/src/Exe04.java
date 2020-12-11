import java.util.Locale;
import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			
			double a = sc.nextInt();
			double b = sc.nextInt();
			double result = a / b;
			
			if (b == 0)
				System.out.println("divisao impossivel");
			else 
				System.out.printf("%.1f\n", result);
		
		}

		sc.close();
	}

}
