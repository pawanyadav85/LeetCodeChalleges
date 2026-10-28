class Solution {
    public int[] findErrorNums(int[] nums) {
        //find dublicate element 
        Arrays.sort(nums);
        int dublicate = 0 ;
        for(int i = 0 ; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                dublicate = nums[i];
                break;
            }
        }
        //find the mismatch element 
        int missing = 1;
        for(int i = 0 ; i < nums.length ;i++){
            if(missing != nums[i]){
                break;
            }else if(missing == dublicate){
                i++;
            }
            missing ++;
        }
        return new int[]{dublicate , missing};
    }
}