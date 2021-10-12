class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        
        while(left < right){
            int mid =  (right + left)/2;
            
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid - 1;
            } else
                left = mid +1;
        }
        
        // Here we should return the position in case the elemenent is not there.
        return nums[left] < target ? left + 1: left;
        
    }
}