package dataStructures.array;

public class MaxSubArraySum {
	
	public static void printSubArraySum(int num[]) {
		int tp =0;
		int currSum =0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<num.length; i++) {
//			int start =i;
			
			for(int j=i; j<num.length; j++) {
//				int end = j;
				currSum =0;
				
				//print 
				for(int k=i; k<=j; k++) {
					currSum = currSum + num[k];
				}
				
				tp++;
				System.out.println(currSum);
				if(currSum > maxSum) {
					maxSum = currSum;
				}
				
			}
		}
		System.out.println("Maximum sum is : " + maxSum);
		System.out.println("Total of subArray is " + tp);
	}

	public static void main(String[] args) {
		
		int num [] = {2,4,6,8};
		printSubArraySum(num);

	}

}
