class Solution {
    public boolean checkValidString(String s) {
        int hi = 0 ;
        int lo = 0 ;
        for(char ele : s.toCharArray()){
            if(ele == '('){
                lo ++;
                hi ++;
            }else if(ele == ')'){
                 hi--;
                 lo--;
            }else{
                lo--;
                hi++;
            }
            lo = Math.max(lo,0);
            if(hi < 0){
                return false;
            }
        }
        return lo == 0;
    }
}