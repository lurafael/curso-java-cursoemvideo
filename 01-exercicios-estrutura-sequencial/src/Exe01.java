import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Aloca memória 
		
		int number1, number2, sum;
		
		number1 = sc.nextInt(); //Espera um int do teclado e atribui a number1
		number2 = sc.nextInt();	//Espera um double do teclado e atribui a number2			
		
		sum = number1 + number2;
		
		System.out.println("SOMA = " + sum);
		
		sc.close(); //Libera a memória alocada
		
	}

}

