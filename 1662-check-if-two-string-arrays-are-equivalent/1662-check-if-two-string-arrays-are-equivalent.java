class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
     return(String.join("", word1).equals(String.join("", word2)));   
        
    }
        
        /* 
            String res1 ="";
            String res2 = "";
            
        
        for(int i = 0 ; i < biggerSize(word1,word2); i++){
            
            res1 += word1[i];
            res2 += word2[i];
            
        }
            
            if(res1.equals(res2)) return true;
        return false;
            
        
        
    }
    
    public int biggerSize(String[] word1, String[] word2){
        if(word1.length >= word2.length) return word1.length;
        return word2.length;
    }
    */
}