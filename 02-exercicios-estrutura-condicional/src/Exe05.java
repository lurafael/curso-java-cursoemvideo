import java.util.Locale;
import java.util.Scanner;

public class Exe05 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int howManyItems = sc.nextInt();
		double total = 0.00;
		
		if(code == 1) 
			total = 4.00;
		else if(code == 2)
			total = 4.50;
		else if(code == 3)
			total = 5.00;
		else if(code == 4)
			total = 2.00;
		else if(code == 5)
			total = 1.50;
		
		total *= howManyItems;
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}

}
