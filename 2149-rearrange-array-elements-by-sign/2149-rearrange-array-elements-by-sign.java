class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] ans = new int[arr.length];
        int n = arr.length;
        int PosNo = 0;
        int NegNo = 1;
        for(int i = 0 ;i < n ; i++){
            if(arr[i] > 0){
                ans[PosNo] = arr[i];
                PosNo += 2;
            }else{
                ans[NegNo] = arr[i];
                NegNo += 2;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna