package dataStructures.array;

public class binaryNumSearch {
	
	public static int binarySearch(int number[], int key) {
		
		int start =0;
		int end = number.length -1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			//comparison
			if(number[mid]== key) {
				return mid;
			}
			
			if(number[mid] < key){ //right
				start = mid +1;
			}else {					// left
				end = mid -1; 
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {

		int number [] = {2,4,6,8,10,12,14};
		int key = 2;
		
		int binary = binarySearch(number, key);
		System.out.println(binary);

	}

}
