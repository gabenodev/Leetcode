import java.util.HashMap;
import java.util.Map;

class Solution {
    public String fractionToDecimal(int numeratorInt, int denominatorInt) {
        if (numeratorInt == 0) {
            return "0";
        }

        StringBuilder resultBuilder = new StringBuilder();

        if ((numeratorInt < 0) != (denominatorInt < 0)) {
            resultBuilder.append("-");
        }

        long numerator = Math.abs((long)numeratorInt);
        long denominator = Math.abs((long)denominatorInt);

        resultBuilder.append(numerator / denominator);
        long remainder = numerator % denominator;
        if (remainder == 0) {
            return resultBuilder.toString(); 
        }

        resultBuilder.append(".");
        Map<Long, Integer> remainderMap = new HashMap<>();

        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                int repeatingStartIndex = remainderMap.get(remainder);

                resultBuilder.insert(repeatingStartIndex, "(");
                resultBuilder.append(")");
                return resultBuilder.toString();
            }

            remainderMap.put(remainder, resultBuilder.length());

            remainder *= 10; 
            resultBuilder.append(remainder / denominator); 
            remainder %= denominator; 
        }

        return resultBuilder.toString(); 
    }
}