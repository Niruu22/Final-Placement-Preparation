package functions_And_Methods;

public class Factorial {
	
	public static int factOf(int n) {
		int fact =1;
		for(int i=n; i>1;i--) {
			fact = fact * i;
		}
		
		//aslo be called same forword
//		for(int i=1; i<=n; i++) {
//			fact = fact * i;
//		}
		return fact;
	}

	public static void main(String[] args) {

		int n =5;
		int factorialOf = factOf(n);
		System.out.println(factorialOf);

	}

}
