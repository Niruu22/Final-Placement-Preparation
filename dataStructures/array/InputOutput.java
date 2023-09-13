package dataStructures.array;
import java.util.*;

public class InputOutput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int marks [] = new int[50];
		
		marks[0] = sc.nextInt();  //math
		marks[1] = sc.nextInt();  //physics
		marks[2] = sc.nextInt();  //chemistry
		
		System.out.println("Math : " +marks[0]);
		System.out.println("Physics : " + marks[1]);
		System.out.println("chemistry : "+ marks[2]);
		
		marks[1] = 98;
		System.out.println("update marks phy :" +marks[1]);
		
		int percentage =(marks[0] + marks[1] + marks[2]) /3;
		System.out.println("percentage is :" + percentage + "%");
	}

}
