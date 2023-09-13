package dataStructures;

	
	public class Test {
		
		public static void reverse(int arr[]) {
			
			for(int i=arr.length-1; i>=0; i--) {
				System.out.println(arr[i]);
			}
		}
	    

	    public static void main(String[] args) {
	        int[] arr = {12, 4, 2, 10, 5, 1};
	       reverse(arr);
	    }
	}

