class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int drankBottles = numBottles;   //5
        int emptyBottles = numBottles;   //5

        while (emptyBottles >= numExchange) {
            int newFullBottles = emptyBottles / numExchange; //5/5=1
            drankBottles += newFullBottles; //5+1=6

            emptyBottles = (emptyBottles % numExchange) + newFullBottles;
        }

        return drankBottles;
    }
} 
