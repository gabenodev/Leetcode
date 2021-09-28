class Solution {
    public int maxProfit(int[] prices) {
        
        
        int max = 0;
        int min = prices[0];
        
        for(int i = 0 ; i < prices.length; i ++){
            if(prices[i] > min){
              max =  Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        
        return max;
        
        /* Time exceeds since it's O(n^2);
            Find a better solution nerd;
            Kadane algorithm?
            Hashmap?
        int max = 0;
        
        for(int i = 0; i< prices.length ; i++){
            for(int j = i+1; j< prices.length; j++){
                
                if(prices[i] < prices[j] && max < prices[j] - prices[i]){
                    max = prices[j] - prices[i];
                } 
            }
        }
        return max;
        */
        
    }
}