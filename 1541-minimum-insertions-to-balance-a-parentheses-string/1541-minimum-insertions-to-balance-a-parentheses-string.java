class Solution {
    public int minInsertions(String s) {
        int req = 0;
        int ans = 0 ;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(req % 2 != 0){
                    ans++;
                    req --;
                }
                req += 2;
            }else{
                req--;
            }
            if(req < 0){
                ans ++;
                req = 1;
            }
        }
        return ans + req;
    }
}