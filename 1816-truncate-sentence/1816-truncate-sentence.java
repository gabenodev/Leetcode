class Solution {
    public String truncateSentence(String s, int k) {
        
        
        int spaces = 0;
        int length = s.length();
        int index = 0;
        
       while(index < length){
               if(s.charAt(index) == ' '){
                   spaces++;
               }
           if(spaces == k){
               return s.substring(0,index);
           }
           index++;
           
       }
        
    return s;
        
    }
}