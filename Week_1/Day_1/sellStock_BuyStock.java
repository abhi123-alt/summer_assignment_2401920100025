class sellStock_BuyStock {
    public int maxProfit(int[] prices) {
        int n=prices.length, i=1, profit=0;
        int buy=prices[0];
        while(i<n){
            if(buy>prices[i]) buy=prices[i];
            profit=Math.max(profit,prices[i]-buy);
            i++;
        }
        return profit;
    }
    public static void main(String[] args) {
        sellStock_BuyStock solution = new sellStock_BuyStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}