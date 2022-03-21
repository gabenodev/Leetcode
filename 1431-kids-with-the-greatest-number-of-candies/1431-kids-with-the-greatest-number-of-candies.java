class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greater = new ArrayList<Boolean>();
        int max = candies[0];
        for(int i = 0 ; i  < candies.length; i++){
            if(max < candies[i]) max = candies[i];
        }
        
        for(int i = 0 ; i < candies.length; i++){
            if(candies[i] + extraCandies >= max)  greater.add(true);
            else greater.add(false);
        }
        
        return greater;
    }
}