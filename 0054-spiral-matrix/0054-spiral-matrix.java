class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length; // row
        int n = arr[0].length; // col
        int FRow = 0 , LRow = m - 1;
        int FCol = 0 , LCol = n - 1;

    List<Integer> ans = new ArrayList<>();
        while(FRow <= LRow && FCol <= LCol){

            for(int j = FCol ; j <= LCol; j++ ){
                ans.add(arr[FRow][j]);
            }
                FRow++;

                if(FRow > LRow || FCol > LCol)
                break;
               for(int i = FRow ; i <= LRow; i++ ){
                ans.add(arr[i][LCol]);
            }
                LCol--;

                if(FRow > LRow || FCol > LCol)
                break;
               for(int j = LCol ; j >= FCol; j-- ){
                ans.add(arr[LRow][j]);
            }
                LRow--;
                if(FRow > LRow || FCol > LCol)
                break;
               for(int i = LRow ; i >= FRow; i-- ){
                ans.add(arr[i][FCol]);
            }
                FCol++;
        }
         return ans;
    }
}