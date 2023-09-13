package dataStructures.array;

public class LargestNoArray {
	
	public static int getLargest(int number[]) {
		
		int largest = Integer.MIN_VALUE;
		
		for(int i=0; i<number.length; i++) {
			if(largest< number[i]){
				largest = number[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		
		int number[] = {1,2,6,4,3};
		int large = getLargest(number);
		System.out.println(large);
		
		
		
		
		
		
		
//		int  number [] = {5,10,6,2,4,7};
//		int max =0;
		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//				
//			}
//			
//		}
//		System.out.println(max);
	}

}
