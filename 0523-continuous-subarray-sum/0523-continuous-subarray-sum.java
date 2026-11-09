class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int prefixSum = 0;
        m.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int r = prefixSum % k;
            if (r == 0 && i >= 1) {
                return true;
            }
            if (m.containsKey(r)) {
                int idx = m.get(r);
                if (i - idx >= 2) {
                    return true;
                }
            } else {
                m.put(r, i);
            }
        }
        return false;
    }
}