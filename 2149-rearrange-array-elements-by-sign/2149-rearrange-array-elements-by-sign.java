class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
     int[] ans = new int[nums.length];
       int PosNo = 0;
        int NegNo = 1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                ans[PosNo] = nums[i];
                PosNo += 2;
            }else{
                ans[NegNo] = nums[i];
                NegNo += 2;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna