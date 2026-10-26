class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int missing = 1;
        int dublicate = 0;
        int j;
        for (int i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    dublicate = nums[i];
                    break;
                }
            }
            if (j != n) {
                break;
            }
        }
        while (missing <= n) {
            int i ;
            for ( i = 0; i < n; i++) {
                if (missing == nums[i]) {
                    break;
                }
            }
            if(i == nums.length){
                break;
            }
            missing ++;
        }
        return new int[]{dublicate , missing};
    }
}