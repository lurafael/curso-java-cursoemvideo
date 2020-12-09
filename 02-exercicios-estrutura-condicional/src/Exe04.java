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
	
		// Lógica usada: 24 é o horário máximo que se pode atingir em um dia, sendo assim,
		//eu subtraio o total de horas do dia, pelo total de horas de jogo daquele dia,
		//sobrando assim só o horário jogado. Então somo o horário jogado do primeiro dia
		//com o horário final do outro dia, já que o jogo continua sem pausas.
		
		System.out.printf("O JOGO DUROU %d HORA(S)", tempoDuracao);
		
		sc.close();
	}
	
}
