class Solution {
    public int mySqrt(int x) {

        int num = 1;

        while(num <= x/num) { 

            if (num == x/num) { 
                return num;
            }
            else if((num+1) > (x/(num+1))) { 
                return num;
            }
            num++; 
        }
        return 0;
    }
}
