class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int [] freq = new int[101];
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            freq[nums[i]] ++;
            if(freq[nums[i]] > max){
                max = freq[nums[i]];
            }
        }
        int sum = 0;
        for(int x : freq){
            if(x == max){
                sum += max;
            }
        }
        return sum;
    }
}