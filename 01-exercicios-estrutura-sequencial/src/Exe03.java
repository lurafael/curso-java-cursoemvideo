import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Aloca memória
		
		int a, b, c, d, result;
		
		a = sc.nextInt(); //Espera um int do teclado e atribui a "a"
		b = sc.nextInt(); //Espera um int do teclado e atribui a "b"
		c = sc.nextInt(); //Espera um int do teclado e atribui a "c"
		d = sc.nextInt(); //Espera um int do teclado e atribui a "d"
		
		result = a * b - c * d;
		
		System.out.println("DIFERENCA = " + result); //Concatenação de String com o valor da var result
		
		sc.close(); //Libera a memória alocada

	}

}
