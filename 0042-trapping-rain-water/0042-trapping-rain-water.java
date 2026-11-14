class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int Lmax = 0, Rmax = 0, water = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                Lmax = Math.max(Lmax, height[l]);
                water += Lmax - height[l];
                l++;
            } else {
                Rmax = Math.max(Rmax, height[r]);
                water += Rmax - height[r];
                r--;
            }
        }
        return water;
    }
}