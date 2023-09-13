package loops.for_loops;
import java.util.*;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int choice;
		int evenSum = 0;
		int oddSum = 0;
		
		
		do {
			System.out.println("Enter your number : ");
			number = sc.nextInt();
			
			if(number % 2 == 0) {
				evenSum = evenSum +number;
			}else {
				oddSum = oddSum + number;
			}
			System.out.println("Do you want a continue then if Yess press 1  or NO Press 0");
			
			 choice = sc.nextInt();
			
		}while(choice ==1);
		
		System.out.println("sum of even numbers " + evenSum);
		System.out.println("sum of odd numbers " + oddSum);
		
		
		
		
	}

}
