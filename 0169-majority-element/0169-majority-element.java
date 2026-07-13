class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int frq = 0;
        for(int i = 0 ; i < n ; i ++){
            if(frq == 0){
                ans = nums[i];
            }if(ans == nums[i]){
                frq ++;
            }else{
                frq--;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna