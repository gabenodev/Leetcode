class Solution {
    public int[] numberOfPairs(int[] nums) {
        
      int[] res = new int[2]; 
      Set<Integer>set = new HashSet<>();
    
        for(int num: nums){
            if(set.contains(num)){
                res[0]++;
                set.remove(num);
                
        } else {
            set.add(num);
        }
            }
        
        res[1] = set.size();
        
        return res;
        
        
    }
}