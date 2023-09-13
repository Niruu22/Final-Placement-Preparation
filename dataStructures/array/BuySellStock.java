package dataStructures.array;

public class BuySellStock {

	public static int buySell(int prices[]) {
		
		int  buyPrice = Integer.MAX_VALUE;
		int maxPrice = 0;
		
		for(int i=0; i<prices.length; i++) {
			if(buyPrice <prices[i]) {
				int profit = prices[i] - buyPrice;    
				maxPrice = Math.max(maxPrice, profit); 
			}else {
				buyPrice = prices[i];
			}
		}
		
		return maxPrice;
		
	}
	
	public static void main(String[] args) {

		int prices [] = {7,1,5,3,6,4};
		
		System.out.println(buySell(prices));
	}

}
