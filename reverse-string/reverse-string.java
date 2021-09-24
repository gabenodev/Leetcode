class Solution {
    public void reverseString(char[] s) {
        
        int begin = 0;
        int end = s.length-1;
        char temp ;
        
        while(end>begin){
            
            temp = s[begin];
            s[begin] = s[end];
            s[end] = temp;
            
            begin++;
            end--;
            
        
        }
        
        
        
    }
}