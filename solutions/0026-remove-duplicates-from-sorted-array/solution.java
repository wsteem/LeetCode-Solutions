class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;

        int temp;
        int count = 1;

        while(p2 < nums.length) {
            if (nums[p1] != nums[p2]) {
                //swap elements of p1+1 and p2
                temp = nums[p1+1];
                nums[p1+1] = nums[p2];
                nums[p2] = temp;

                count++;
                p1++;
            }
            p2++;
        }
        return count;
    }
}
