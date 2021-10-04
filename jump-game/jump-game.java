class Solution {
    public boolean canJump(int[] nums) {
        
        int index_value = 0;
        
        for(int i =0 ; i < nums.length ; i++){
            if( i > index_value)
                return false;
            
                index_value = Math.max(i + nums[i],index_value);
                
        }
                return true;
        
    }
}