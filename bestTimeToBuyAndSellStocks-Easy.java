class Solution {
    public int maxProfit(int [] prices) {

        int i = 0;
        int profit = 0;
        boolean hasStock = false;
        int priceBought = 0;


        while(i<prices.length-1) {
            if(hasStock) {
                if(prices[i]>prices[i+1]) {
                    profit+=prices[i]-priceBought;
                    hasStock = false;
                }
            }
            else {
                if(prices[i+1]>=prices[i]) {
                    priceBought=prices[i];
                    hasStock = true;
                }
            }
            i++;
        }
        if(hasStock) profit+=prices[i]-priceBought;
        return profit;
    }

}