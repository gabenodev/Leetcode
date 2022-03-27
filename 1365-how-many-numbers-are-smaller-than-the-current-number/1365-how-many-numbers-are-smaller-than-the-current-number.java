class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        //int counter = 0;
        
        for(int i = 0 ; i < nums.length; i++){
          int counter=0;
            for(int j = 0 ; j < nums.length; j++){
                if(nums[j] < nums[i] && i != j) counter++;
                
            }
            result[i] = counter;
        }
        
        return result;
    }
}