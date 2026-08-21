class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();
        //find the first element of the string 
        char[] left = strs[0].toCharArray();
        //find last element of the string 
        char[] right = strs[strs.length - 1].toCharArray();
        //campare left ans rigth;
        for(int i = 0 ; i < left.length ; i++){
            if(left[i] != right[i]){
                break;
            }
              ans.append(left[i]);
        }
        return ans.toString();
    }
}