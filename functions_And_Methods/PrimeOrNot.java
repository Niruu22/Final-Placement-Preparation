package functions_And_Methods;

public class PrimeOrNot {
	
	public static boolean isPrime(int n) {
		boolean prime =true;
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				prime = false;
			}	
		}
		if(n<2) {
			prime= false;
		}	

		return prime;
	}
	
	
	public static void primeRange(int n) {
		for(int i=2; i<=n; i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println(isPrime(12));
		
		primeRange(20);
		

	}

}
