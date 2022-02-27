class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int ans[] = new int[nums.length*2];
        int size = nums.length;
        
        for(int i = 0 ; i < nums.length; i++){
            ans[i] = nums[i];
        }
        
        for(int i = 0; i< nums.length ; i++){
            ans[size] = nums[i];
            size++;
        }
        
        return ans;
        
    }
}