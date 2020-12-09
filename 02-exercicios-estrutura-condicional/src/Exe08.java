import java.util.Locale;
import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2000.0) 
			imposto = 0.0;
		else if (salario <= 3000.0) 
			imposto = (salario - 2000.0) * 0.08;
		else if (salario <= 4500.0) 
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		else 
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f\n", imposto);
		}
		
// Lógica usada

//Até 2.000 não paga nada, 

//se for de 2.000,01 até 3.000,00 precisamos tirar os 2.000,00 isentos, e o que sobra cobrar 8%, 

//se for de 3.000,01 até 4.500,00 tira os 2.000,00 isentos, cobra os 8% dos 2.000,01 até
//3.000,00, e o resto cobra 18%,

//se for de 4.500,00, tiro 3.000,00 (2.000,00 isentos e 1.000,00 que cobra 8%), cobra 18% 
//em cima do que sobra, e por fim multiplica os 1.000,00 que segurei no começo, com os 8%,

//se for acima de 4.500,00, pego o que for maior que 4.500,00 e tiro 28%, depois pego os 1.500,00
//e cobro 18%, depois os 1.000,00 cobro 8%.
		
		sc.close();
	}
}