class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        
        // Step 1 : find pivit element 
        int pivit = - 1;
        for(int i = n - 2; i >= 0 ; i-- ){
            if(arr[i] < arr[i + 1]){
                pivit = i;   //  pivit mil gaya 
                break;
            }
        }
        // if pivit is not found the return first permutation 
        if(pivit == - 1){
            Arrays.sort(arr);
            return;
        }
        // step 2 : array par reverse me taravese karo or check karo 
        // keya  pivit n - 1 se smaller hai agar hai to swap kar do  
        for(int i = n - 1 ; i >= pivit; i -- ){
            if(arr[pivit] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[pivit];
                arr[pivit] = temp;
                break;
            }
        }
        int i = pivit + 1; 
        int j = n - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna