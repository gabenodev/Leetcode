class Solution {
    public int[] twoSum(int[] nums, int target) {
        
            int sum = 0;
            int[] result = new int[2];
        
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 1 ; j < nums.length; j++){
                if( i != j){
                    sum = nums[i] + nums[j];
                    if(sum == target){
                        for(int k = 0 ; k < result.length ; k++){
                            result[0] = i;
                            result[1] = j;
                        }
                    }
                }
            }
        }
        
        return result;
        
    }
}