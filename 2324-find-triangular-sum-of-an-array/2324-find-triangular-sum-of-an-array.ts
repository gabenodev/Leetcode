// 2 solutions
// 1st solution -> (intuitive for me) recursion -> cleaner code but not optimal on big arrays
// 2nd solution -> while-> we do it in one operation instead of recalling the function

/*
function triangularSum(nums: number[]): number {
    if (nums.length == 1) {
        return nums[nums.length-1];
    }
    let newNums: number[] = [];
    for(let i = 0 ; i < nums.length-1; i++){
        newNums[i] = ( nums[i] + nums[i+1] ) % 10;
    }
    return triangularSum(newNums)
}; */
 
 function triangularSum(nums: number[]): number {

    if(nums.length == 1){
        return nums[nums.length-1];
    }

    while(nums.length != 1){
        for(let i = 0 ; i < nums.length-1; i++){
            nums[i] = (nums[i] + nums[i+1]) % 10;
        }
        nums.pop();
    }
    return nums[0];
 }