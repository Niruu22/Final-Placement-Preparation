package dataStructures.sortingAlgorithms;

public class SelectionSort {
	
	public static void selection(int num[]) {
		
		for(int i=0; i<num.length-1; i++) {
			int smallest =i;
			for(int j=i+1; j<num.length; j++) {
				if(num[smallest] > num[j]) {
					smallest = j;
				}
			}
			
			int temp = num[smallest];
			num[smallest] = num[i];
			num[i] = temp;
		}
	}

	public static void main(String[] args) {
		
		int num [] = {2,6,7,1,9,3,8,5,4};
		
		selection(num);
		
		// print arr
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		

	}

}
