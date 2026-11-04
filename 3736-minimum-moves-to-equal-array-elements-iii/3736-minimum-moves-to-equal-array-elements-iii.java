class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 0 ; i < n ; i++){
             max = Math.max(max , nums[i]);
        }
         int result = 0 ; 
        for(int i = 0 ; i < n ; i ++){
            result += max - nums[i];
        }
        return result;
    }
}