package loops.while_loops;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		
		// print 1 to n 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num= 1;
		
		while(num<=n) {
			System.out.println(num);
			num++;
		}

	}

}
