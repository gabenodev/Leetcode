function numWaterBottles(numBottles: number, numExchange: number): number {
    let totalDrunkBottles = numBottles
    let currentEmptyBottles = numBottles


    while(currentEmptyBottles >= numExchange ){
        let newBottles = Math.floor(currentEmptyBottles/numExchange)
        totalDrunkBottles += newBottles
        currentEmptyBottles = ( currentEmptyBottles % numExchange) + newBottles
    }
    return totalDrunkBottles
};