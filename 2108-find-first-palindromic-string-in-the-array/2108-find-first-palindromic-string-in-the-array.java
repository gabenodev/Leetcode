class Solution {
    public String firstPalindrome(String[] words) {
        
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
}