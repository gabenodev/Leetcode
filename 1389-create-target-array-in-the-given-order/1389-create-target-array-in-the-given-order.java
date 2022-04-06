class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
     
        int[] res = new int[nums.length];
        ArrayList<Integer> pos = new ArrayList<Integer>();
        
        for(int i = 0 ; i < nums.length; i++){
            pos.add(index[i],nums[i]);
        }
        
        for(int i = 0 ; i < nums.length; i++){
            res[i] = pos.get(i);
        }
        
        return res;
        
            
    }
}