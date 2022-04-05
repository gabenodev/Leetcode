class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        List<Integer> arr = new ArrayList<>();
       
        
       for(int i = 0 ; i < nums.length ; i+=2){
           int freq = nums[i];
           int val = nums[i+1];
           
           int j = 0 ;
           
           while(j < freq){
               arr.add(val);
               j++;
           }
       }
        
         int[] res = new int[arr.size()];
        for(int index = 0 ; index < arr.size(); index++){
            res[index] = arr.get(index);
        }
        
        return res;
        
    }
}