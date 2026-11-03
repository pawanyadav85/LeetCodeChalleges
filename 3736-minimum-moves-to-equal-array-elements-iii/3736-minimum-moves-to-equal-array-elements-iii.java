class Solution {
    public int minMoves(int[] nums) {
        //calculate maximum element 
        int max = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max , nums[i]);
        }
        //calculate of moves element 
        int idx = 0 ; 
        for(int i = 0 ; i < nums.length ; i++){
            idx += max - nums[i];
        }
        return idx ;
    }
}