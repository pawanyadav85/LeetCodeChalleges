class Solution {
    public boolean isValid(String s) {
        char [] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char ele : arr){
            if(ele == '('){
                st.push(')');
            }
            else if(ele == '{'){
                st.push('}');
            }
            else if(ele == '['){
                st.push(']');
            }
            else{
                if(st.isEmpty() || st.pop() != ele){
                    return false;
                }
            }
        }
        return st.empty();
    }
}