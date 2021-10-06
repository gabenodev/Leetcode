class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        
        // The time complexity is not so friendly :)
        
        Arrays.sort(nums);
        List<Integer> duplicates = new ArrayList<>();
        
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                duplicates.add(nums[i]);
            }
        }
        
        return duplicates;
        
        
        
        
        /* Time limit exceeds + space complexity exceeds
        List<Integer> duplicates = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
           int seen = nums[i];
            if(map.containsValue(seen)){
                duplicates.add(nums[i]);
            } else
                map.put(i,nums[i]);
        }
        
        return duplicates;
        
        */
        
        
        
    }
}