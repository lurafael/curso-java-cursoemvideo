import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number >= 0)
			System.out.println("NÃO NEGATIVO");
		else
			System.out.println("NEGATIVO");
		
		sc.close();
	}

}
