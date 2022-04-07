class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int size = arr.length;
        int result = 0;
        
        for(int i = 0 ; i < size; i++){
            
            int endingArr = i + 1;
            int startArray = size-i;
            
            int totalSub = endingArr * startArray;
            int oddSub = (int)Math.ceil(totalSub / 2);
            
            if(totalSub % 2 == 1){
               oddSub ++;
            }
             result += oddSub * arr[i];
        }
        
        return result;
    }
}