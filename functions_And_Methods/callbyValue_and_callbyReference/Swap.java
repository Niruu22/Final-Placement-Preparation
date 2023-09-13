package functions_And_Methods.callbyValue_and_callbyReference;

public class Swap {
	
	public static void swapNum(int a , int b) {
		
//		int a= 5;
//		int b =10;
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a is : " + a);
		System.out.println("b is : " + b);
		
		
	}

	public static void main(String[] args) {

		int a= 5;
		int b =10;
		swapNum(a, b);
//		System.out.println("a is : " + a);
//		System.out.println("b is : " + b);
		
		
	}

}
