package loops.continue_and_break;
import java.util.*;
public class UseContinue {

	public static void main(String[] args) {
		
		//Display all the numbers enter by the user except multiples of 10

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter Your number");
			int n = sc.nextInt();
			if(n % 10 == 0) {
				continue;
			}
			System.out.println("number was " + n);
		}while(true);
	}

}
