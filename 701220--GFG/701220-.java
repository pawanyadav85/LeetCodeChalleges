class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        int ans = 0;
        int frq = 0;
        for(int i = 0 ; i < n ; i++){
            if(frq == 0){
                ans = arr[i];
            } if(ans == arr[i]){
                frq ++;
            }else{
                frq --;
            }
        }
        frq = 0 ;
        for(int i = 0 ; i < n ; i++){
        if(arr[i] == ans){
            frq ++;
        }
        }
         if(frq > n / 2){
             return ans;
         }else{
             return - 1;
         }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna