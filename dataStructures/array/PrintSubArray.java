package dataStructures.array;

public class PrintSubArray {
	
	public static void subArray(int num[]) {
		
		for(int i=0; i<num.length; i++) {
			int start = i;
			
			for(int j=i; j<num.length; j++) {
				int end =j;
				
				//print 
				for(int k=start; k<=end; k++) {
					System.out.print(num[k]);   ///
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		int num [] = {2,4,6,8,10,12};
		subArray(num);
	}

}
