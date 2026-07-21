class Solution {
    public void rotate(int[][] matrix) {
        //transpose of given matrix
        for(int i = 1 ; i < matrix.length; i++){
            for(int j = 0 ; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row 
        for(int i = 0 ; i < matrix.length; i++){
        int lo = 0;
        int hi = matrix[0].length - 1;
        
        while(lo < hi){
            int temp = matrix[i][lo];
            matrix[i][lo] = matrix[i][hi];
            matrix[i][hi] = temp;
            lo++;
            hi--;
        }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna