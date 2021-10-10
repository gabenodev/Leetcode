class Solution {
    public int search(int[] nums, int target) {
        
        // binary search implementation
        int low = 0;
        int high = nums.length - 1;
        
        while ( low <= high){
            int mid = (low+high)/2;
            
            if(nums[mid] > target){
                high = mid - 1;
            } else if (nums[mid] < target){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        
        return -1;
        
        /*
        
        [-1,0,3,5,9,12]   =>   target = 0      expected output 4;
        
        low = 0
        high = 5
        
        
        (0<5)
        mid = 2
        if(3 > 9)
        false
        else if( 3 < 9)
        true
        low = 3
        */
        
    }
}