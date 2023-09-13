package functions_And_Methods;

public class ProductOfNum {
	
	public static int multiply(int a , int b) {
		int product = a *b;
		return product;
	}

	public static void main(String[] args) {
		
		int a =10;
		int b =25;
		
		int mul = multiply(a,b);
		System.out.println(mul);
		

	}

}
