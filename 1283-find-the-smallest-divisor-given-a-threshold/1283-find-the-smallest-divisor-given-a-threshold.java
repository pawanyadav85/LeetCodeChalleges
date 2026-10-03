class Solution {
    public int smallestDivisor(int[] nums, int target) {
        int lo = 1 ; 
        int hi = 0;
        int max = 0;
        for(int ele : nums){
            hi = Math.max(hi,ele);
        }
        while(lo <= hi ){
            int mid = lo +  (hi - lo) / 2;
            int sum = 0;
            for(int ele : nums){
                sum += (ele + mid - 1) / mid;
            }
            if(sum <= target){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return lo;
    }
}