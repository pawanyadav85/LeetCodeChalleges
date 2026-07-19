class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        Arrays.sort(arr);
        int prev = arr[0];
        int max = 1;
        int count = 1;
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] == prev){
                continue;
            }else if(arr[i] == prev + 1){
                count ++;
                prev = arr[i];
            }else{
                count = 1;
                prev = arr[i];
            }
            max = Math.max(max,count);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna