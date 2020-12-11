import java.util.Scanner;

public class Exe02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 1; i <= number; i++) {
			int aux = sc.nextInt();
			
			if(aux >= 10 && aux <= 20)
				in++;
			else
				out++;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
	
}
