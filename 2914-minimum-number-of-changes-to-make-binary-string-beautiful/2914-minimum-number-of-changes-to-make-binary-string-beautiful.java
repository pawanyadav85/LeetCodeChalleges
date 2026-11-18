class Solution {
    int solve(String s ){
        if(s.charAt(0) != s.charAt(1)){
            return 1;
        }else{
            return 0;
        }
    }
    public int minChanges(String s) {
        int count = 0;
        for(int i = 0 ; i <s.length(); i +=2){
            count += solve(s.substring(i ,i + 2));
        }
        return count;
    }
}