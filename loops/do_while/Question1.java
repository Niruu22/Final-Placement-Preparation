package loops.do_while;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		// keep entering numbers till user enter a multiple of 10
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter Your number :");
			int n = sc.nextInt();
			if(n % 10 == 0) {
				break;
			}
			System.out.println(n);
		}while(true);
		
		System.out.println("exit");

	}

}
