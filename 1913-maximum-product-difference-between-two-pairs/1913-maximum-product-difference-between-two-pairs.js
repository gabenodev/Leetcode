/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProductDifference = function(nums) {
    
    let min = 1e4
    let max = 0
    let prevMin = min
    let prevMax = 0
    
    
    for(const number of nums){
        if(number > max){
            prevMax = max
            max = number
        } else if(number > prevMax){
            prevMax = number
        }
        
        if(number < min){
            prevMin = min
            min = number
        } else if(number < prevMin)
            prevMin = number
    }
    
    
    return max*prevMax - min*prevMin
};