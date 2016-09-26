public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0)
            return 0;
            
        int min = prices[0];
        int[] profits = new int[len];
        profits[0] = 0;
        
        for(int i = 1 ; i < len ; i++){
            if(prices[i] < min)
                min = prices[i];
            if(profits[i-1] < prices[i] - min)
                profits[i] = prices[i] - min;
            else
                profits[i] = profits[i-1];
        }
        
        return profits[len-1];
    }
}