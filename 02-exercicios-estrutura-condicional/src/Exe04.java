import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int tempoDuracao;
		
		if(horaInicial < horaFinal)
			tempoDuracao = horaFinal - horaInicial;
		else
			tempoDuracao = 24 - horaInicial + horaFinal;
	
		// L�gica usada: 24 � o hor�rio m�ximo que se pode atingir em um dia, sendo assim,
		//eu subtraio o total de horas do dia, pelo total de horas de jogo daquele dia,
		//sobrando assim s� o hor�rio jogado. Ent�o somo o hor�rio jogado do primeiro dia
		//com o hor�rio final do outro dia, j� que o jogo continua sem pausas.
		
		System.out.printf("O JOGO DUROU %d HORA(S)", tempoDuracao);
		
		sc.close();
	}
	
}
