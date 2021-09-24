class Solution {
    public boolean isPalindrome(int x) {
        
        int lastNumber = 0;
        int copyX = 0;
        int reverse = x;
        
        while(x!= 0){
            
            lastNumber = x%10;
            copyX = copyX * 10 + lastNumber;
            x = x/10;
                
        }
        
        if(reverse == copyX && reverse >= 0){
            return true;
        } else {
            return false;
        }
        
    }
}