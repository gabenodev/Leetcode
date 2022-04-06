/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
var restoreString = function(s, indices) {
    let t = []
    for(let i = 0 ; i < s.length ; i++){
    t[indices[i]]=   s[i]
        }
    return t.join('')
};