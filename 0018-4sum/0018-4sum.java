class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            //skip dublicate
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1; j < n ; j++){
                // duplicate ignore karo
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int p = j + 1;
                int q = n - 1;
                while(p < q){
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if(sum < target){
                        p++;
                    }else if(sum > target){
                        q--;
                    }else{
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[p]);
                        temp.add(nums[q]);
                        ans.add(temp);
                        p++;
                        q--;
                        while(p < q && nums[p] == nums[p - 1]){
                            p++;
                        }
                        while(p < q &&nums[q] == nums[q + 1]){
                            q--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}