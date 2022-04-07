/**
 * @param {number[]} arr
 * @return {number}
 */
var sumOddLengthSubarrays = function(arr) {
  
    let sum = 0;
    let size = arr.length;
    
    for(let i = 0 ; i<size; i++){
        let total = (i+1)*(size-i)
        sum += Math.ceil(total/2) * arr[i]
    }
    
    return sum
    
};