package FB_practice;
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

one pass[] time: O(N) space: O(1) */
public class BuySellStockII {
    public int buySellStockII(int [] prices){
        int maxProfit =0; 

        for(int i =1; i<prices.length; i++){
            if(prices[i]>prices[i-1])
            maxProfit+=prices[i]- prices[i-1];
        }
        return maxProfit;
    }
}
