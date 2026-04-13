class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        //find index where nums[index] == target
        //return the most minimal 
        int answer = 0;
        int absValue = 0;
        boolean found = false;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                absValue = Math.abs(i - start);
                if(!found) {
                    answer = absValue;
                    found = true;
                }
                if(absValue < answer && found) {
                    answer = absValue;
                }
            }
        }
        return answer;
    }
}
