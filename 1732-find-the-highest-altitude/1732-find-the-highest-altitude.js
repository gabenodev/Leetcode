/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function(gain) {
    
    let [cur_max, alt] = [0, 0];
    for(let el of gain){
        alt += el
        if(cur_max < alt) cur_max = alt 
    }
    
    return cur_max
};