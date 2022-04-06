class Solution {
    public String restoreString(String s, int[] indices) {
        char[] newS = new char[s.length()];
            
        for(int i = 0 ; i < s.length(); i++){
            newS[indices[i]] = s.charAt(i);
        }
        
        return String.valueOf(newS);
        
    }
}