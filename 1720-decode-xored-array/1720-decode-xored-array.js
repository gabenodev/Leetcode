/**
 * @param {number[]} encoded
 * @param {number} first
 * @return {number[]}
 */
var decode = function(encoded, first) {
    
    
    var numbers = [first]
    
    
    for(let i = 0 ; i < encoded.length ; i++){
        numbers.push(encoded[i] ^ numbers[numbers.length-1])
    }
    /*
    for(let i = 0 ; i < encoded.length ; i++){
        numbers[i+1] = encoded[i] ^ numbers[i]
    }
    */
    
    return numbers
    
};