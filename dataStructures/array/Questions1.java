package dataStructures.array;

//Find a continuous sub array whose sum is equal to given
//number. e.g. if given array is { 12 ,4, 2, 10 , 5 , 1 } and given
//number is 16 then sum of subarray { 4,2,10} and {10, 5,1} is
//equal to given number.

public class Questions1 {
	
	public static void getSubArray(int arr[], int sumValue) {
		
		int currSum =0;
		
		
		for(int i=0; i<arr.length; i++) {
			currSum =0;
			for(int j=i; j<arr.length; j++) {
				currSum += arr[j];
				if(currSum == sumValue) {
					System.out.println("subarray with sum " +sumValue + " : ");
					for(int k=i; k<=j; k++) {
						System.out.print(arr[k]+ " ");
						
					}
					System.out.println();
				}	
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = {12,4,2,10,5,1};
		int sumValue = 16; 
		
		getSubArray(arr, sumValue);
	}

}
