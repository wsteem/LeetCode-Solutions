class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) {
            return 0;
        }
        int mid = 0;
        int p1 = 0;
        int p2 = nums.length - 1;

        while(true) {
            mid = ((p2-p1)/2) + p1;

            if (nums[mid] < target && mid+1 <= p2) {
                p1 = mid+1;
            }
            else if (nums[mid] > target && mid-1 >= p1) {
                p2 = mid-1;
            }
            else if(nums[mid] == target) {
                return mid;
            }
            else {
                return -1;
            }
        }
    }
}
