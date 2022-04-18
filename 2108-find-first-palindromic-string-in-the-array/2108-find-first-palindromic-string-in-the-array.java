class Solution {
    public String firstPalindrome(String[] words) {
     
       
        
        for(String word: words){
            StringBuilder rWord = new StringBuilder();
            rWord.append(word);
            rWord.reverse();
            if(rWord.toString().equals(word))
                return word;
        }
        return "";
        
    }
        
        /* Not so efficient I guess..
        for(String element: words){
            if(isPalindrome(element))
                return element;
        }
        
        return "";
        
        
    }
    
    private static boolean isPalindrome(String word){
        
        String result = "";
        
        for(int i = word.length()-1; i>=0; i--){
            result += word.charAt(i);
        }
        
        return result.equals(word)?true:false;
        
    }
    */
}