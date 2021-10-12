class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZero = 0;
        
        // Add all element that are not zero on the array
        for(int i = 0 ; i < nums.length; i++){
           if(nums[i] != 0){
               nums[nonZero] = nums[i]; // We can re-write as nums[nonZero++] to increment
               nonZero++;
           }
        }
        
        // Finally we add al zeros to the end of the array
        
        for(int i = nonZero ; i < nums.length ; i++){
            nums[i] = 0;
        }
        
    }
}