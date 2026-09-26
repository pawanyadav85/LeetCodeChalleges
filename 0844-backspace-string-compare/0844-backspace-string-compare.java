class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        for(char ele : s.toCharArray()){
            if(ele == '#'){
                if(!st.isEmpty() ){
                    st.pop();
                }
            }else{
                st.push(ele);
            }
        }
        for(char i : t.toCharArray() ){
            if(i == '#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }else{
                st1.push(i);
            }
        }
        return st.equals(st1);
    }
}