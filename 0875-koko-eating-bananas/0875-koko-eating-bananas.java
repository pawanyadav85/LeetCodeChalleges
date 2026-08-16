class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1 , hi = 0;
        for(int ele : piles){
        hi = Math.max(hi,ele);
                }
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
          long hours = 0 ;
          for(int ele : piles){
            hours += (ele + mid - 1) / mid;
          }
          if(hours <= h){
            hi = mid - 1;
          }else{
            lo = mid + 1;
          }
        }
        return lo;
    }
}