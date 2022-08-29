class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        
        List<List<Integer>> finalList = new ArrayList<>();
        int maxSize = 0;
        
        // Creating the bucket
        for(int i = 0 ; i < groupSizes.length; i ++){
            maxSize = Math.max(maxSize, groupSizes[i]);}
            List<Integer> bucket[] = new List[maxSize + 1];
        
        
        for(int i = 0 ; i < groupSizes.length; i++){
            int currMax = groupSizes[i];
            if(bucket[currMax] == null){
                bucket[currMax] = new ArrayList<>();
            }
            bucket[currMax].add(i);
        
        
        if(bucket[currMax].size() == currMax){
            finalList.add(bucket[currMax]);
            bucket[currMax] = null;
        }
        }
        
        return finalList;
        
        
        
        
        
        
        
        
        /* Using HashMap
        
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        HashMap<Integer, List<Integer>> map = new HashMap();
        
        for(int i = 0 ; i < groupSizes.length; i ++){
            int size = groupSizes[i];
            
            List<Integer> group = map.getOrDefault(size, new ArrayList<>());
            group.add(i);
            map.put(size,group);
            
            if(group.size() == size){
                finalList.add(group);
                map.remove(size);
            }
                        
        }
        
       
        return finalList;
        */
    }
}




/*

Understanding the problem

input : groupSizes = [3,3,3,3,3,1,3]
output: []


one solution
groupSizes[0] = 3
groupSizes[1] = 3
groupSized[2] = 3
OUTPUT = [0,1,2]

second solution
groupSized[5] = 1
OUTPUT = [5]

third solution
groupSizes[3] = 3
groupSizes[4] = 3
groupSized[6] = 3

*/