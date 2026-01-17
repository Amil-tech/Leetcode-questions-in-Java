import java.util.HashMap;

public class BestTimeToBuyStock {

	public static void main(String[] args) {
		int[] array = {7,6,4,3,1};
		System.out.println(maxProfit(array));
        HashMap<Integer,Integer> map = new HashMap<>();
        
	}
	
    public static int maxProfit(int[] prices) {
    	
        int maxProf = 0;
        
        int leastToBuy = prices[0];
        
        for(int i = 1; i < prices.length; i++) {
        	if(prices[i] - leastToBuy > maxProf) {
        		maxProf = prices[i] - leastToBuy;
        	}
        	leastToBuy = (leastToBuy > prices[i]) ? prices[i] : leastToBuy;
        }
        
        return maxProf;
    }
    
    
    

}
