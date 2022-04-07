class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
         int index=0;
        int result=0;
        if(ruleKey.equals("type")){
                index=0;
        }else if(ruleKey.equals("color")){
                index=1;
        }else if(ruleKey.equals("name")){
                index=2;
        }
        for(List<String> lista: items){
            if(lista.get(index).equals(ruleValue)){
                result++;
            }
        }
        return result;
        
        
    }
}