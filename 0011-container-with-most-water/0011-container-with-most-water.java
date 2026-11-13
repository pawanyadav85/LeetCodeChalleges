class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0 , r = n - 1;
        int MaxArea = 0;
        while(l < r){
            int MinHeight = Math.min(height[l],height[r]);
            int width = r - l;
            int area = width * MinHeight;
            MaxArea = Math.max(area,MaxArea);
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }
        return MaxArea;
    }
}