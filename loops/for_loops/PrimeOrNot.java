package loops.for_loops;
import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime=true;
		
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				isPrime = false;
			}
		}
		
		if(n < 2) {
			isPrime = false;
		}
		
		if(isPrime == true) {
			System.out.println("it is prime");
		}else {
			System.out.println("it is not prime");
		}
	}
	

}
