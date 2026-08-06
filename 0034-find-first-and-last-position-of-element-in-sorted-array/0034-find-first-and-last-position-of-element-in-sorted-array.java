class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lo = 0 , hi = n - 1;
        int ans1 = - 1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] > target ){
                hi = mid - 1;
            }else if(nums[mid] < target){
                lo = mid + 1;
            }else{
                ans1 = mid;
                hi = mid - 1;
            }
        }
            lo = 0 ;
            hi = n - 1;
            int ans2 = - 1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] > target ){
                hi = mid - 1;
            }else if(nums[mid] < target){
                lo = mid + 1;
            }else{
                ans2 = mid;
                lo = mid + 1;
            }
        }
        return new int[]{ans1, ans2};
    }
}