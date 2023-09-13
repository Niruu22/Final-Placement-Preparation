package loops.for_loops;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
		
//		for(int i=1; n>0; i++) {
//			int lastDigit = n % 10;
//			System.out.print(lastDigit);
//			n= n/10;
//		}
//		
//		System.out.println();
		
		int num = 543201;
		int rev =0;
		
		for(;num>0;num= num/10) {
			int  lastDigit = num %10;
			rev = (rev *10) + lastDigit;
			
		}
		
		System.out.println(rev);
		
	}

}
