/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var truncateSentence = function(s, k)  {
    
    let spaces = 0;
    for(let i = 0 ; i < s.length; i ++){
        if(s[i] === ' ' && ++spaces === k){
            return s.slice(0,i)
        }
    }
    
    return s;
    
};