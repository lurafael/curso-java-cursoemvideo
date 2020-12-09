import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
//	Express�es e tipos b�sicos em Java

		// Ordem de preced�ncia em Java
		// 1� lugar: * / %
		// 2� lugar: + -

		// Exemplos:
		// 3 + 2 * 4 = 11
		// (3 + 2) * 4 = 20
		// 60 / (3 + 2) * 4 = 48
		// 60 / ((3 + 2) * 4) = 3

//Vari�veis e tipos b�sicos em Java

		// Sintaxe: tipo nome = valor
		// Exemplo:
		String nome = "Lucas";
		double idade = 27.0;

//Tipos de prints

		System.out.println("Hello, world!"); // o println quebra linha automaticamente
		System.out.print("Bom dia!");
		System.out.print("Bom boa tarde!"); // o print n�o quebra linha
		System.out.printf("%.2f\n", idade); // printf formata no padr�o que eu colocar, tamb�m n�o quebra linha

		// Obs: O printf pega o idioma do computador e aplica o padr�o daquele pa�s, o
		// 27 est�
		// separado por v�rgula porque � o padr�o no brasil. Para trocar para o padr�o
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

//Boa pr�tica em declara��es com pontos flutuantes
		
		// Declara��o de float
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

		Scanner sc = new Scanner(System.in); // Aloca mem�ria necess�ria para o sc por causa do new

		String firstName, lastName;

		firstName = sc.next(); // Permite que eu digite uma palavra e atribua ao firstName
		lastName = sc.next();

		System.out.println("O nome digitado foi: " + firstName + " " + lastName); // sysout + Ctrl + espa�o cria o
																					// System.out.println();
		// ou
		System.out.printf("O nome digitado foi: %s %s", firstName, lastName);

		sc.close(); // Libera a mem�ria

		// .next -> String
		// .nextLine -> String at� a quebra de linha
		// .nextInt -> inteiro
		// .nextDouble -> double
		// .next().charAt(index) -> Pega a letra passada ao index

//Fun��es Matem�ticas

		// Alguns exemplos
		// Math.sqrt(x) -> Ra�z quadrada
		// Math.pow(x, y) -> Valor de x elevado a y
		// Math.abs(x) -> Valor absoluto de x *Tirar o valor negativo caso exista

	}
}
