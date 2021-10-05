class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        /* Simple hashmap solution to see if there is a same key in hashmap
        
            Runs a bit slower
            
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            } else
                map.put(nums[i],i);
        }
        
        return false;
        
        */
        
        
        //Iterative solution
        // Faster solution
        
        Arrays.sort(nums);
        
        for(int i = 1 ; i < nums.length; i++){
        
        if(nums[i] == nums[i-1]){
            return true;
        }
    }
        return false;
    }
}
