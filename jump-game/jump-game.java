class Solution {
    public boolean canJump(int[] nums) {
        
        int index_value = 0;
        
        for(int i =0 ; i < nums.length ; i++){
            if( i > index_value)
                return false;
            
                index_value = Math.max(i + nums[i],index_value);
                
        }
                return true;
        
    }
}

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