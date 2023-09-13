package loops.nested_loops_pattern;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {

		//A
		//BC
		//DEF
		//GHIJ
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char ch = 'A';
		
		//outer loop
		for(int i=1; i<=n; i++) {
			
			//inner loop
			for(int j=1; j<=i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
