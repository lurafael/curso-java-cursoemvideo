//import java.util.Scanner;

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
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Quantas horas?"); // Quantas horas?
//		
//		int horas = sc.nextInt();
//		
//		if(horas < 12) // Se horas for menor que 12,
//			System.out.println("Bom dia"); //Imprime bom dia...
//		else
//			System.out.println("Boa tarde"); //Senão, imprime boa tarde!
//		
//		sc.close();
		
		//Posso usar o else if caso tenha mais possibilidades :)
	
//Operadores de atribuição cumulativa
		
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
//				System.out.println("Terça");
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
//				System.out.println("Inválido");
//				break;
//		}
		
//Condicional ternária
		
//		int idade = 19;
//		String podeBeber = idade >= 18 ? "Liberado!" : "Não pode beber";
//
//		System.out.println(podeBeber); // Liberado

//Escopo e inicialização
		
		//Em java uma variável não pode ser usada se não for inicializada, em C traria 
		//lixo de memória, mas em Java a IDE vai acusar erro
		
		//Respeita o escopo de onde foi criada, por exemplo se uma variável for criada
		//dentro de um for, ela só existe lá dentro.
	
	}

}
