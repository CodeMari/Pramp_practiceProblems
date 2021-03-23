package FB_practice;
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
time: o(n) space O(1) */
public class BuySellStock {
    public int BuySellStock(int [] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0; 

        for(int i =0; i<prices.length; i++){
            if(prices[i]< buyPrice)
            buyPrice = prices[i]; 
            else if(prices[i]- buyPrice>maxProfit)
            maxprofit = prices[i]-buyPrice; 
        }
        return maxProfit; 

    }
}
