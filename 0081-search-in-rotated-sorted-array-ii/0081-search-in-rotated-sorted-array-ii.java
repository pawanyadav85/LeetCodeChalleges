class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0 , hi = n - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            // If target is fount 
            if(nums[mid] == target){
                return true;
            }
            // if the mid== hi==lo  three element are equal 
            if(nums[lo] == nums[mid] && nums[mid] == nums[hi]){
                lo++;
                hi--;
                continue;
            }
            //  if Array are sorted in right side 
            if(nums[lo] <= nums[mid]){
                if(nums[lo] <= target && target <= nums[mid]){
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            }else{
                // if array is sorted in left side 
                if(nums[mid] <= target && target <= nums[hi] ){
                    lo = mid + 1;
                }else{
                    hi = mid - 1;
                }
            }
        }
        return false;
    }
}