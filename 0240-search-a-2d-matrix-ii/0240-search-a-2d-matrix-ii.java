class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
    int n = arr.length , m = arr[0].length;
         int i = 0 , j = m - 1;
        while(i < n  && j >= 0 ){
            if(arr[i][j] > target){
                j--;
            }else if (arr[i][j] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}   


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna