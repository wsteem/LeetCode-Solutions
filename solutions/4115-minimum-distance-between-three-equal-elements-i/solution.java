class Solution {
    public int minimumDistance(int[] nums) {

        int answer = 0;
        int distance = 0;
        for(int i=0; i<nums.length-2; i++) {
            for(int j = i+1; j<nums.length-1; j++) {
                for(int k = j+1; k<nums.length; k++) {
                    if(nums[i] == nums[j] && nums[j] == nums[k]) {
                        distance = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                          
                        if(answer == 0 || distance < answer) {
                            answer = distance;
                        }
                    }
                }
            }
        }
        if(answer != 0) return answer;
        return -1;
    }
}
