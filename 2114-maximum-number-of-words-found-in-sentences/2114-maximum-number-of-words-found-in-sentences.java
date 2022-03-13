class Solution {
    public int mostWordsFound(String[] sentences) {
        
        char space = ' ';
        int max = -1;
         
        if(sentences == null){
            return 0;
        }
        
        for(int i = 0 ; i < sentences.length; i++){
           int words = 1;
            for(int j = 0 ; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == space){
                    words++;
                }
            }
            if(max < words) {
                max = words;
            }
        }
        return max;
        
    }
}