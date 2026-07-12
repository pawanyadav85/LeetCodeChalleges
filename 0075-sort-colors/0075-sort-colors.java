class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0 , mid = 0 , hi = n - 1;
        for(int i = 0 ; i < n ;i++){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[lo];
                nums[lo] = temp;
                lo++;
                mid ++;
            }else if (nums[mid] == 1 ){
                mid ++;
            }else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[hi];
                nums[hi] = temp;
                hi--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna