class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int fullBottles = numBottles;
        int emptyBottles = 0;
        int bottlesDrunk = 0;

        while(true) {
            
            if (fullBottles != 0) {
                //drink water
                emptyBottles += fullBottles;
                bottlesDrunk += fullBottles; 
                fullBottles = 0;
            }
            else if (emptyBottles >= numExchange) {
                //exchange for 1 bottle
                fullBottles ++;
                emptyBottles -= numExchange;
                numExchange++;
            }
            else {
                return bottlesDrunk;
            }
        }
    }
}
