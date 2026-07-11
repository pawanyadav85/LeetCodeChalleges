class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        
    //     for(int i = 0 ; i < n; i++){
    //         int sum = 0;
    //         for(int j = i ; j < n ; j++){
    //             sum += arr[j];
    //             max = Math.max(sum,max);
    // }
    //     }
        
        for(int i = 0; i < n ; i++){
          sum += arr[i];
          max = Math.max(sum,max);
          if(sum < 0){
              sum = 0;
          }
        
        
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna