class Solution {
    public void reverseString(char[] s) {
        
      /* Swap the letters in the array.  
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
        */
        
        reverse(s);
        
    }
    
    
    // Implementation using stack.
    
    public void reverse(char[] s){
        
         Stack<Character> stack = new Stack<Character>();    
         

    for(int i = 0; i < s.length; i++) { 
        stack.push(s[i]);

    }
        int i =0;
        while(!stack.isEmpty()){
        s[i++] = stack.pop();  // s[i++] post incremental. Returns the value then it increments it by 1.
        }
        
    }
}
