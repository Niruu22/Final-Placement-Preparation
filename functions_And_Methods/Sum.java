package functions_And_Methods;
import java.util.*;

public class Sum {
	
	public static void sumOf(int num1, int num2) { /// paramaters  or formal parameters

		int sum = num1 + num2;
		System.out.println("The sum is : " + sum);
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		sumOf(a,b);    //arguments or actual  parameter

	}

}
