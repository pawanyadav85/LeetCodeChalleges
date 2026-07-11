class Solution {
    public void nextPermutation(int[] nums) {
            int n = nums.length;
            int pivot = - 1;
            // Step : 1  find pivot element 
            for(int i = n - 2 ; i >= 0 ; i--){
                if(nums[i] < nums[i + 1]){
                    pivot = i;
                    break;
                }
            }
            if(pivot == - 1){
                Arrays.sort(nums);
                return ;
            }
            // Step 2 : to find next largest element 
            for(int i = n - 1 ; i > pivot ; i --){
                if(nums[pivot] < nums[i] ){
                    int temp = nums[pivot];
                    nums[pivot] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            // Step 3 : swap pivot to  n - 1; 
            int i = pivot + 1 , j = n - 1;
            while(i <= j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna