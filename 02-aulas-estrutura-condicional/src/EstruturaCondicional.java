import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
//Operadores Lógicos 
		
		// && -> E
		// || -> OU
		// ! -> NÃO
		
		// && precisa ter todas as condições atendidas para ter um resultado final Verdadeiro
		
		// 10 <= 10 && 5 == 5
		// 	  V          V     Atendeu as condições, então o resultado é Verdadeiro
		
		// 5 <= 20 && 5 == 10
		//   V          F       Não atendeu as condições, então o resultado final é Falso
		
		
		// || precisa ter pelo menos uma condição atendida para ter um resultado Verdadeiro
		
		// 10 <= 10 || 5 < 5
		// 	  V          F     Atendeu pelo menos uma condição, então o resultado é Verdadeiro
		
		// 5 == 20 || 5 == 10
		//   F          F       Não atendeu nenhuma condição, então o resultado final é Falso

		// ! nega o resultado original das expressões
		
		// !(10 == 10) 
		//      F     Seria verdadeiro se não tivesse o ! que nega o resultado.
		
		
//Estrutura Condicional if-else
		Scanner sc = new Scanner(System.in);
		
		int horas = sc.nextInt();
		
		System.out.println("Quantas horas?"); // Quantas horas?
		
		if(horas < 12) // Se horas for menor que 12,
			System.out.println("Bom dia"); //Imprime bom dia...
		else
			System.out.println("Boa tarde"); //Senão, imprime boa tarde!
		
		sc.close();
		
		//Posso usar o else if caso tenha mais possibilidades :)
		
	}

}
