class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int size = nums.length;
      
        
        for (int i = 0, j = n, index = 0; index < result.length; i++, j++) {
            
            result[index++] = nums[i];
            result[index++] = nums[j];
        }
        
        
        return result;
    }
}