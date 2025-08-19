// You are given an integer array prices representing the prices of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.
// You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.
// Return the amount of money you will have leftover after buying the two chocolates. If there is no way for you to buy two chocolates without ending up in debt, return money. Note that the leftover must be non-negative.
public class A08_buy_two_chocolates {
    class Solution {
    public int buyChoco(int[] prices, int money) {
        int currPrice = 0;
        int maxProfit = 0;
        int n = prices.length;
        boolean yes = false;

        // Loop for pairs
        for(int i = 0;i<n-1;i++){
            for(int j = i+1 ;j<n;j++){
                if((prices[i] + prices[j]) <= money){
                    currPrice = prices[i]+prices[j];
                    // We need to maximize the left over money
                    maxProfit = Math.max(money-currPrice,maxProfit);
                // maxReturn = Math.max(maxReturn,money-currPrice);
                yes=true;
                }
                
            }
        }
        if(yes){
            return maxProfit;
        }else{
            return money;
    }
    }
}
}
