class Solution {
    public void sortColors(int[] nums) { 
        //using two pointer approach 
        int lo = 0;
        int mid = 0;
        int hi = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[lo];
                nums[lo] = temp;
                lo++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[hi];
                nums[hi] = temp;
                hi--;
            }
        }
    }
}