class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        /* Passes only half of the tests?
        for(int i = 0 ; i < nums.length; i++){
            if(i % 2 == 0 && nums[i] % 2 == 1 || i % 2 == 1 && nums[i] % 2 == 0 ){
                for(int j = i+1 ; j < nums.length; j++){
                    if(j % 2 == 1 && nums[j] % 2 == 0 || j % 2 == 0 && nums[j] % 2 == 1){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                       //break;
                    }
                }
            }
        }
        
        return nums;
        */
        
        int even = 0;
        int odd = 1;
        
        while(even < nums.length && odd < nums.length){
            if(nums[even] % 2 == 0){
                even += 2;
            } else if(nums[odd] % 2 == 1){
                odd += 2;
            } else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }
        
        return nums;
        
    }
}