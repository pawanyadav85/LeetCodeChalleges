class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer , Integer> s = new HashMap();
        s.put(0,1);
        int result = 0;
        int prefixSum = 0 ;
        for(int arr : nums){
            prefixSum += arr;
            if(s.containsKey(prefixSum - k)){
                result += s.get(prefixSum - k);
            }
            s.put(prefixSum , s.getOrDefault (prefixSum , 0) + 1);
        }
        return result;
    }
}