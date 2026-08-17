class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if ((long) m * k > n) {
    return -1;
    }
        int lo = 0 , hi = 0;
        for(int ele : bloomDay){
            // sabse kam day 
            lo = Math.min(lo,ele);
            // Sabse gretest day 
            hi = Math.max(hi,ele);
        }
        while(lo <= hi ){
            int mid = lo + (hi - lo)/2;
            int flowers = 0;
            int bouquets = 0;
            // find mid din me kinte bouquests ban sakate hai 
            for(int ele : bloomDay){
                if(ele <= mid){
                flowers ++;
            }else{
                flowers = 0;
            }
            // if flowers find contineous 
            if(flowers == k){
                bouquets ++;
                flowers = 0;
            }
        }
        // if m jayeda ya equal ban gaye to 
        if(bouquets >= m){
            hi = mid - 1;
        }else{
            lo = mid + 1;
        }
        }
        return lo;
    }
}