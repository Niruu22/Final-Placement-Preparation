package dataStructures.sortingAlgorithms;
import java.util.*;

public class InbuiltSort {
	
	public static void print(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Integer arr [] = {4,1,7,3,6,8,2,9,5,};
		Arrays.sort(arr);
		
//		print(arr);
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
