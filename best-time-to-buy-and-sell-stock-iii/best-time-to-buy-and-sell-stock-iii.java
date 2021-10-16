class Solution {
    public int maxProfit(int[] prices) {
        
        int firstBuy=Integer.MAX_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;
        
        for(int curPrice : prices){
            firstBuy = Math.min(firstBuy , curPrice);
            firstSell = Math.max(firstSell, curPrice - firstBuy);
            secondBuy = Math.max(secondBuy, firstSell - curPrice);
            secondSell = Math.max(secondSell , curPrice + secondBuy);
            
        }
        return secondSell;
        
    } 
}