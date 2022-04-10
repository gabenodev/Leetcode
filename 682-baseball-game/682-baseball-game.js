/**
 * @param {string[]} ops
 * @return {number}
 */
var calPoints = function(ops) {
    
     let record = [];
    
    ops.forEach((element) => {
        switch(element){
            case "+":
                record.push(record[record.length-1] + record[record.length-2]);
                break;
            case "D":
                record.push(record[record.length-1] * 2);
                break;
            case "C":
                record.pop();
                break;
            default:
                record.push(Number(element));
        }
    });
    
    return record.reduce((prev, curr) => prev + curr);
};