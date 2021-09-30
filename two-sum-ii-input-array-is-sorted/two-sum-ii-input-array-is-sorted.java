class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
       
        
        for(int i = 0 ; i < numbers.length ; i++){
            
            int complement = target - numbers[i];
            
            if(map.containsKey(complement)){
                int[] result = {map.get(complement)+1,i+1} ;
                return result;
                
            } else {
                map.put(numbers[i] , i);
            }
            
        
        }
        
        int[] no = {-1,-1};
        return no;
    }
}