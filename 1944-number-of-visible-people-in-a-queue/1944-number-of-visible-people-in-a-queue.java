class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);
        ans[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            int count = 0;
            while (!st.isEmpty() && st.peek() <= arr[i]) { // if arr value greater coutn and remove all smaller
                count++;
                st.pop();
            }
            if (!st.isEmpty()) { // if array size is empty then then count 1;
                count++;
            }
            ans[i] = count;
            st.push(arr[i]);
        }
        return ans;
    }
}