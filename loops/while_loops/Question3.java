package loops.while_loops;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {

		// print sum of first n natural no...
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i =1;
		int sum =0;
		
		while(i<=n) {
			sum = sum +i;
			i++;
		}
		System.out.println(sum);
		

	}

}
