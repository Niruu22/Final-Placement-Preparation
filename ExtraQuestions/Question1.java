package ExtraQuestions;

// Write program to create following numberseries. Print numbers upto 10000. 
//-1 , 2 , -2, 3 ,-6 , 7 ,-39 , 46, -1525 , 2112.........

public class Question1 {
	

	public static void main(String[] args) {
	
		int n =10;
		int a=-1;
		int b =2;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<=n; i++) {
			a = -((a*a)+ i);
			b = ((b*b)-i);
			if(a>-10000 && b<10000 ) {
				System.out.println(a);
				System.out.println(b);
			}
			
			
		}
		

	}

}
