class Solution {
    public int lastStoneWeight(int[] stones) {
        
        Arrays.sort(stones);
        int size = stones.length - 1;
        
        while(size != 0){
            
            if(stones.length-1 == stones.length-2){
                stones[stones.length-1] = 0;
                stones[stones.length-2] = 0;
            }
            
            if(stones.length-1 != stones.length-2){
                stones[stones.length-1] = stones[stones.length-1] - stones[stones.length-2];
                stones[stones.length-2] = 0;
            }
            Arrays.sort(stones);
            size--;
        }
        
        for(int st : stones){
            if(st != 0){
                return st;
            }
        }
        
        return 0;
        
    }
}