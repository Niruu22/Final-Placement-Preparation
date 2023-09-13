package dataStructures.sortingAlgorithms;

public class InsertionSort {

	public static void insertion(int num[]) {
		
		for(int i=1; i<num.length; i++) {
			int curr= num[i];
			int prev = i-1;
			
			//finding out the curr pos to insert
			while(prev >=0 && curr < num[prev]) {
				num[prev+1] = num[prev];
				prev--;
			}
			
			num[prev+1] = curr;
		}
	}
	
	public static void main(String[] args) {


		int num [] = {7,3,1,5,9,4,8,2,6};
		
		insertion(num);
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
	}

}
