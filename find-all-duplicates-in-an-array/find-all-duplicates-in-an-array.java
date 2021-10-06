class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer> duplicates = new ArrayList<>();
        
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                duplicates.add(nums[i]);
            }
        }
        
        return duplicates;
    }
}