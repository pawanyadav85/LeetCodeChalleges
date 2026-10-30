class Solution {
    public int[] findErrorNums(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != nums[nums[i] - 1]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        int dublicate = 0 ;
        int missing = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != i + 1){
                dublicate = nums[i];
                missing = i + 1;
                break;
            }
        }
        return new int[]{dublicate , missing};
    }
}