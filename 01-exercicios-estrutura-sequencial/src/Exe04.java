import java.util.Locale;
import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //Aloca memória 
		
		int employeeNumber, workedHours;
		double howPerHour, salary;
		
		employeeNumber = sc.nextInt(); //Espera um int do teclado e atribui a employeeNumber	
		workedHours = sc.nextInt(); //Espera um int do teclado e atribui a workedHours	
		howPerHour = sc.nextDouble(); //Espera um double do teclado e atribui a howPerHour	
		
		salary = workedHours * howPerHour;
		
		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f", salary); //Formata com 2 casas decimais após o "."
		
		sc.close(); //Libera a memória alocada

	}

}
