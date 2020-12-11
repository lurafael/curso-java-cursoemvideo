
public class TopicosBasicos {
	public static void main(String[] args) {

//Convenções Java
		
//		variáveis não podem começar com dígito, usar letra ou _
//		não usar acentos ou til
//		não pode ter espaço em branco
		
//		Usar o modo Camel Case: lastName
//		Onde usar? Em pacotes, atributos, métodos, variáveis e parâmetros 
		
//		Usar o modo Pascal Case: ProductService
//		Onde usar? Classes
		
//Operadores bitwise
		
//		&, | e ^, sendo que os dois primeiros são iguais aos && e || 
//		e o ^ (XOR), dá verdadeiro quando 1 opção é verdadeiro pelo menos, e
//		falso quando as 2 forem falsas ou as 2 forem verdadeiras
		
//		Analisa os 0 e 1 de acordo com a tabela verdade
		
//Funções interessantes para Strings
		
//		• Formatar: toLowerCase(), toUpperCase(), trim()
//		• Recortar: substring(inicio), substring(inicio, fim)
//		• Substituir: Replace(char, char), Replace(string, string)
//		• Buscar: IndexOf, LastIndexOf
//		• str.Split(" ")
		
		String original = "Lucas Rafael Ricci   ";
		String[] vetor;
		
		System.out.println(original.toLowerCase()); //Tudo em minúsculo
		System.out.println(original.toUpperCase()); //Tudo em maiúsculo
		System.out.println(original.trim()); //Remove os espaços antes e depois da string
		System.out.println(original.substring(2)); //Monta uma string a partir do 2 até o fim
		System.out.println(original.substring(2, 8)); //Monta uma string a partir do 2 e até o 8(mas não imprime ele)
		System.out.println(original.replace('a', 'x')); //Troca todos os a por x
		System.out.println(original.replace("ci", "cinho")); //funciona para mais de uma letra
		System.out.println(original.indexOf("cc")); //Encontra a PRIMEIRA ocorrencia do que foi passado por parâmetro
		System.out.println(original.lastIndexOf("cc")); //Encontra a ULTIMA ocorrencia do que foi passado por parâmetro
		
		//Separa as palavras por índices, pelo que for passado no parâmetro, 
		//nesse caso espaço 1-Lucas, 2-Rafael, 3-Ricci
		vetor = original.split(" ");
		System.out.println(vetor[0]); 
		System.out.println(vetor[1]); 
		System.out.println(vetor[2]); 
		System.out.println(vetor.length); //Conta o tamanho do vetor
		
	}
}
