//import java.util.Scanner;

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
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Quantas horas?"); // Quantas horas?
//		
//		int horas = sc.nextInt();
//		
//		if(horas < 12) // Se horas for menor que 12,
//			System.out.println("Bom dia"); //Imprime bom dia...
//		else
//			System.out.println("Boa tarde"); //Sen�o, imprime boa tarde!
//		
//		sc.close();
		
		//Posso usar o else if caso tenha mais possibilidades :)
	
//Operadores de atribui��o cumulativa
		
//		int x = 5;
//		int y = 10;
//
//		System.out.println(x += y); // x = x + y = 15
//		System.out.println(x *= y); // x = x * y = 150
//		System.out.println(x %= y); // x = x % y = 0
		
//Switch case
		
//		System.out.println("Digite o dia da semana desejado!");
//		int daysOfWeek = sc.nextInt();
//		
//		switch(daysOfWeek) {
//			case 1:
//				System.out.println("Domingo");
//				break;
//			case 2:
//				System.out.println("Segunda");
//				break;
//			case 3:
//				System.out.println("Ter�a");
//				break;
//			case 4:
//				System.out.println("Quarta");
//				break;
//			case 5:
//				System.out.println("Quinta");
//				break;
//			case 6:
//				System.out.println("Sexta");
//				break;
//			case 7:
//				System.out.println("Domingo");	
//				break;
//			default:
//				System.out.println("Inv�lido");
//				break;
//		}
		
//Condicional tern�ria
		
//		int idade = 19;
//		String podeBeber = idade >= 18 ? "Liberado!" : "N�o pode beber";
//
//		System.out.println(podeBeber); // Liberado

//Escopo e inicializa��o
		
		//Em java uma vari�vel n�o pode ser usada se n�o for inicializada, em C traria 
		//lixo de mem�ria, mas em Java a IDE vai acusar erro
		
		//Respeita o escopo de onde foi criada, por exemplo se uma vari�vel for criada
		//dentro de um for, ela s� existe l� dentro.
	
	}

}
