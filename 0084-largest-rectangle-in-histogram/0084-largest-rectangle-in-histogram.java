class Solution {
    public int largestRectangleArea(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        // Next Smaller Element
        int[] nextSm = new int[n];
        st.push(n - 1);
        nextSm[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nextSm[i] = n;
            } else {
                nextSm[i] = st.peek();
            }
            st.push(i);
        }
        // Clear stack
        while (!st.isEmpty()) {
            st.pop();
        }
        // Previous Smaller Element
        int[] prevSm = new int[n];
        st.push(0);
        prevSm[0] = -1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                prevSm[i] = -1;
            } else {
                prevSm[i] = st.peek();
            }
            st.push(i);
        }
        // Calculate maximum area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
           int area = arr[i] * (nextSm[i] - prevSm[i] - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}