import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
//	Expressões e tipos básicos em Java

		// Ordem de precedência em Java
		// 1º lugar: * / %
		// 2º lugar: + -

		// Exemplos:
		// 3 + 2 * 4 = 11
		// (3 + 2) * 4 = 20
		// 60 / (3 + 2) * 4 = 48
		// 60 / ((3 + 2) * 4) = 3

//Variáveis e tipos básicos em Java

		// Sintaxe: tipo nome = valor
		// Exemplo:
		String nome = "Lucas";
		double idade = 27.0;

//Tipos de prints

		System.out.println("Hello, world!"); // o println quebra linha automaticamente
		System.out.print("Bom dia!");
		System.out.print("Bom boa tarde!"); // o print não quebra linha
		System.out.printf("%.2f\n", idade); // printf formata no padrão que eu colocar, também não quebra linha

		// Obs: O printf pega o idioma do computador e aplica o padrão daquele país, o
		// 27 está
		// separado por vírgula porque é o padrão no brasil. Para trocar para o padrão
		// americano,
		// usa-se o Locale.
		Locale.setDefault(Locale.US);
		System.out.printf("Formato americano: %.2f\n", idade);

//Concatenando elementos

//		%f - ponto flutuante
//		%d - inteiro
//		%s - texto
//		%n - quebra de linha

		System.out.println("Nome: " + nome + ", " + "Idade: " + idade);
		System.out.printf("Nome: %s, Idade: %.0f\n", nome, idade);

//Boa prática em declarações com pontos flutuantes
		
		// Declaração de float
		float a;
		double b;
		a = 6f;
		b = 6.0;

//Fazendo Casting 
		
		int c, d;
		double resultado;
		c = 5;
		d = 2;

		resultado = (double) c / d; // 2.5

		System.out.println(resultado);

//Entrada de dados
		
		// Precisamos importar o Scanner
		// import java.util.Scanner;

		Scanner sc = new Scanner(System.in); // Aloca memória necessária para o sc por causa do new

		String firstName, lastName;

		firstName = sc.next(); // Permite que eu digite uma palavra e atribua ao firstName
		lastName = sc.next();

		System.out.println("O nome digitado foi: " + firstName + " " + lastName); // sysout + Ctrl + espaço cria o
																					// System.out.println();
		// ou
		System.out.printf("O nome digitado foi: %s %s", firstName, lastName);

		sc.close(); // Libera a memória

		// .next -> String
		// .nextLine -> String até a quebra de linha
		// .nextInt -> inteiro
		// .nextDouble -> double
		// .next().charAt(index) -> Pega a letra passada ao index

//Funções Matemáticas

		// Alguns exemplos
		// Math.sqrt(x) -> Raíz quadrada
		// Math.pow(x, y) -> Valor de x elevado a y
		// Math.abs(x) -> Valor absoluto de x *Tirar o valor negativo caso exista

	}
}
