
public class TopicosBasicos {
	public static void main(String[] args) {

//Conven��es Java
		
//		vari�veis n�o podem come�ar com d�gito, usar letra ou _
//		n�o usar acentos ou til
//		n�o pode ter espa�o em branco
		
//		Usar o modo Camel Case: lastName
//		Onde usar? Em pacotes, atributos, m�todos, vari�veis e par�metros 
		
//		Usar o modo Pascal Case: ProductService
//		Onde usar? Classes
		
//Operadores bitwise
		
//		&, | e ^, sendo que os dois primeiros s�o iguais aos && e || 
//		e o ^ (XOR), d� verdadeiro quando 1 op��o � verdadeiro pelo menos, e
//		falso quando as 2 forem falsas ou as 2 forem verdadeiras
		
//		Analisa os 0 e 1 de acordo com a tabela verdade
		
//Fun��es interessantes para Strings
		
//		� Formatar: toLowerCase(), toUpperCase(), trim()
//		� Recortar: substring(inicio), substring(inicio, fim)
//		� Substituir: Replace(char, char), Replace(string, string)
//		� Buscar: IndexOf, LastIndexOf
//		� str.Split(" ")
		
		String original = "Lucas Rafael Ricci   ";
		String[] vetor;
		
		System.out.println(original.toLowerCase()); //Tudo em min�sculo
		System.out.println(original.toUpperCase()); //Tudo em mai�sculo
		System.out.println(original.trim()); //Remove os espa�os antes e depois da string
		System.out.println(original.substring(2)); //Monta uma string a partir do 2 at� o fim
		System.out.println(original.substring(2, 8)); //Monta uma string a partir do 2 e at� o 8(mas n�o imprime ele)
		System.out.println(original.replace('a', 'x')); //Troca todos os a por x
		System.out.println(original.replace("ci", "cinho")); //funciona para mais de uma letra
		System.out.println(original.indexOf("cc")); //Encontra a PRIMEIRA ocorrencia do que foi passado por par�metro
		System.out.println(original.lastIndexOf("cc")); //Encontra a ULTIMA ocorrencia do que foi passado por par�metro
		
		//Separa as palavras por �ndices, pelo que for passado no par�metro, 
		//nesse caso espa�o 1-Lucas, 2-Rafael, 3-Ricci
		vetor = original.split(" ");
		System.out.println(vetor[0]); 
		System.out.println(vetor[1]); 
		System.out.println(vetor[2]); 
		System.out.println(vetor.length); //Conta o tamanho do vetor
		
	}
}
