class Solution {
    public int longestConsecutive(int[] nums) {
       int n = nums.length;
        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int prev = nums[0];
        int max = 1;
        
        for(int i = 1 ; i < n ; i++ ){
            if(nums[i] == prev){
                continue;
            }else if(nums[i] == prev + 1){
                count ++;
                prev = nums[i]; 
            }else{
              count = 1;
              prev = nums[i];
            }
            max = Math.max(count,max);
        }
        return max;
    }
}