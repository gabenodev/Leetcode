function swap(arr: number[], i: number, j: number){
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

function partition(arr: number[], low: number, high: number): number{
    //Chosen element as pivot is the last element
    const pivot = arr[high]

    let i = (low-1)

    for(let j = low; j <= high - 1; j++){
        if( arr[j] >= pivot){
            i++
            swap(arr,i,j)
        }
    }

    // -> below swaps the pivot on its correct position
    swap(arr,i+1, high);
    return(i+1)
}

function quickSort(arr: number[], low: number, high: number){
    if(low<high){
        const pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high)
    }
}

function sortArrayWithQuickSort(arr: number[]): number[] {
    quickSort(arr, 0, arr.length - 1);
    return arr;
}

function largestPerimeter(nums: number[]): number {
    sortArrayWithQuickSort(nums)
    for(let i  = 0 ; i < nums.length; i++){
        if(nums[i+2] + nums[i+1] > nums[i])
        return nums[i] + nums[i+1] + nums[i+2]
    }
    return 0
};