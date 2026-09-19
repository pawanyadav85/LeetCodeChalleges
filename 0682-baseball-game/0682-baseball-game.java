class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            String s = arr[i];
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                st.push(2 * st.peek());
            }else if(s.equals("+")){
                int top = st.pop();
                int SecTop = st.peek();
                int sum = top + SecTop;
                st.push(top);
                st.push(sum);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}