class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> val = new ArrayList<>();
        for(int i = 0 ; i < nums1.length; i++){
            for(int j = 0 ; j < nums2.length; j++){
                if(nums1[i] == nums2[j]  && !val.contains(nums1[i])){
                    val.add(nums1[i]);
                     break;
                }
            }
        }
        int [] ans = new int[val.size()];
        for(int i = 0 ; i < val.size() ; i++){
            ans[i] = val.get(i);
        }
        return ans;
    }
}