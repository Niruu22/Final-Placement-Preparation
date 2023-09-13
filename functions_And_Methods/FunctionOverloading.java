package functions_And_Methods;

public class FunctionOverloading {
	
	public static int sum(int a , int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int multiply(int a , int b) {
		return a * b;
	}
	
	public static float multiply(float a , float b) {
		return a * b;
	}
	
	public static void main(String[] args) {

		int func1 =sum(5, 5);
		int func2 =sum(5, 10, 15);
		
	    System.out.println(func1);
	    System.out.println(func2);
		
	   System.out.println(sum(10, 12)); 
	   
	   
	   int mul = multiply(11,12);
	   double mul2 = multiply(12.5f, 12.8f);

	}

}
