class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int lo = 0 , hi = n - 1;
        int ans = -1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        if (ans == -1){
            return n;
        }
        return ans;
    }
}