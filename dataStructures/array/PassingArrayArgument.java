package dataStructures.array;

public class PassingArrayArgument {
	
	public static void update(int marks[], int nonChangebel) {
		
		nonChangebel =5;
		
		//update by 1
		for(int i=0; i<marks.length; i++) {
			marks[i] = marks[i] + 1;
		}
	}

	public static void main(String[] args) {
		int nonChangebel = 10;
		int marks [] = {96,92,91};
		update(marks,nonChangebel);        //call by reference
		
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
		
		//print array marks
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println(nonChangebel);
	}

}
