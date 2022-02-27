class Solution {
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        int result[] = new int[nums.length];
        result[0] = nums[0];
        
        for(int i = 1 ; i < nums.length ; i++){
            
            result[i] = result[i-1] + nums[i];
        }
        
        return result;
        
    }
}