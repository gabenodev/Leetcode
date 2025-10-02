class Solution:
    def maxBottlesDrunk(self, numBottles: int, numExchange: int) -> int:
        numOfDrinkedBottles = numBottles
        numOfEmptyBottles = numBottles

        while numOfEmptyBottles >= numExchange:
            numOfEmptyBottles -= numExchange 
            numOfDrinkedBottles += 1
            numOfEmptyBottles += 1
            numExchange += 1



        return numOfDrinkedBottles


        