package loops.advanced_pattern;

public class Pattern3 {

	public static void hollowPattern(int rows,int cols) {
		
		//outer loop
		for(int i=1; i<=rows; i++) {
			
			//inner loop
			for(int j=1; j<=cols; j++) {
				//cells (i ,j)
				if(i == 1 || i == rows || j == 1 || j == cols) {
					//boundary ->
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		hollowPattern(6, 8);

	}

}
