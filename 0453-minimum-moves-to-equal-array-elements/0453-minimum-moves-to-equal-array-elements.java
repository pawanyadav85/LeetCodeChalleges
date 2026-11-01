class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        //find minimum element 
        for(int i = 0 ; i < nums.length; i++){
            min = Math.min(min,nums[i]);
        }
        //calculate minimum moves
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i] - min;
        }
        return sum;
    }
}