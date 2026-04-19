class Solution {
    public int mirrorDistance(int n) {
        int original_n = n;
        int reversed_n = 0;
        int temp_n = n;
        int digit;

        while(temp_n > 0) {
            digit = temp_n % 10;
            reversed_n = (reversed_n * 10) + digit;
            temp_n = temp_n / 10;
        }
        return Math.abs(original_n - reversed_n);
    }
}
