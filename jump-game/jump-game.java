class Solution {
    public boolean canJump(int[] nums) {
         // This is forward solution looping from 0 to len
        /*
        int index_value = 0;
        
        for(int i =0 ; i < nums.length ; i++){
            if( i > index_value)
                return false;
            
                index_value = Math.max(i + nums[i],index_value);
                
        }
                return true;
        */
        
        int lastPosition = nums.length - 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            if(nums[i] + i >= lastPosition){
                lastPosition = i;
            }
        }
        
        return lastPosition == 0;
        


      



/*
i= 0;
0 > 0 false

index_value= Math.max(0 + 2 , 0) => index_value = 2;


i=1;
1 > 2 false
index_value = Math.max(1 + 3 , 2) => index_value = 4;

i=2;
2 > 4 false
index_value = Math.max(2+1 , 4) => index_value = 4;

i=3;
3>4 false
index_value = Math.max(3+1 , 4) => index_value = 4;

i=4
4>4 false
index_value = Math.max(4+4, 4 ) = > index_value = 8;

return true;


*/
    }
}