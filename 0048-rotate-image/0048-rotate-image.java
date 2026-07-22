class Solution {
    public void rotate(int[][] matrix) {
 
        // taranspose of given matrix 
        for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < i;j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
        }
        // Reverse of the Matrix
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