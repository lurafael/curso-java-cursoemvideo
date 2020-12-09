import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
//Operadores L�gicos 
		
		// && -> E
		// || -> OU
		// ! -> N�O
		
		// && precisa ter todas as condi��es atendidas para ter um resultado final Verdadeiro
		
		// 10 <= 10 && 5 == 5
		// 	  V          V     Atendeu as condi��es, ent�o o resultado � Verdadeiro
		
		// 5 <= 20 && 5 == 10
		//   V          F       N�o atendeu as condi��es, ent�o o resultado final � Falso
		
		
		// || precisa ter pelo menos uma condi��o atendida para ter um resultado Verdadeiro
		
		// 10 <= 10 || 5 < 5
		// 	  V          F     Atendeu pelo menos uma condi��o, ent�o o resultado � Verdadeiro
		
		// 5 == 20 || 5 == 10
		//   F          F       N�o atendeu nenhuma condi��o, ent�o o resultado final � Falso

		// ! nega o resultado original das express�es
		
		// !(10 == 10) 
		//      F     Seria verdadeiro se n�o tivesse o ! que nega o resultado.
		
		
//Estrutura Condicional if-else
		Scanner sc = new Scanner(System.in);
		
		int horas = sc.nextInt();
		
		System.out.println("Quantas horas?"); // Quantas horas?
		
		if(horas < 12) // Se horas for menor que 12,
			System.out.println("Bom dia"); //Imprime bom dia...
		else
			System.out.println("Boa tarde"); //Sen�o, imprime boa tarde!
		
		sc.close();
		
		//Posso usar o else if caso tenha mais possibilidades :)
		
	}

}
