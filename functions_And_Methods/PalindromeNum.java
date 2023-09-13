package functions_And_Methods;

public class PalindromeNum {
	
	public static void palindrome(int n ) {
		int rev =0;
		int temp =n;
		
		while (temp >0) {
			int lastDigit = temp % 10;
			temp = temp/10;
			rev = rev * 10 + lastDigit;
		}
		
		if(rev == n) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindorme");
		}

	}

	public static void main(String[] args) {

		palindrome(1425);
		
		
	}

}
