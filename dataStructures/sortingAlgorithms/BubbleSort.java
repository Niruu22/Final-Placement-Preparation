package dataStructures.sortingAlgorithms;

public class BubbleSort {
	
	public static void bubble(int num[]) {
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-i-1; j++) {
				
				if(num[j] > num[j+1]) {
					
					
					//swap
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
				
			}
		}	
	}

	public static void main(String[] args) {

//		int num [] = {7,8,1,4,2,5,3,9,6};
		int num [] = {1,2,3,4,5};
		
		
		bubble(num);
		// print arr
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();

	}

}
