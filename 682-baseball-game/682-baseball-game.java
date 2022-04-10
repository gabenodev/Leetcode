class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> record = new ArrayList<Integer>();
        
        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("+")) {
                int num1 = record.get(record.size() - 1);
                int num2 = record.get(record.size() - 2);
                record.add(num1+num2);
            }
            else if(ops[i].equals("D")) {
                int num = record.get(record.size() - 1);
                record.add(2 * num);
            }
            else if(ops[i].equals("C")) {
                record.remove(record.size() - 1);
            }
            else {
                record.add(Integer.parseInt(ops[i]));
            }
        }
        
        int sum = 0;
        for(int j = 0; j < record.size(); j++) {
            sum += record.get(j);
        }
        
        return sum;
    }
}