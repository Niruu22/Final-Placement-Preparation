package loops.advanced_pattern;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		
		//1
		//23
		//456
		//78910

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		
		//outer loop
		for(int i=1; i<=n; i++) {
			
			//inner loop
			for(int j=1; j<=i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
