class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        /* Some test cases fail ?
        int even = 0;
        int odd = 1;
        
        while(even < nums.length  && odd < nums.length){
            if(nums[even] % 2 == 0){
                even++;
            
            } else if(nums[odd] % 2 == 1){
                odd++;
            } else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] =  temp;
            }
        }
        return nums;
        */
        
        
        int k = 0;
        int[] ans = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                ans[k] = nums[i];
                k++;
            }
        }
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]% 2 == 1){
                ans[k] = nums[i];
                k++;
            }
        }
        
        return ans;
        
        
    }
}