// ________________________________________________________________ Time complexity-> O(N^2), Space complexity-> O(1)
public class Solution {
    public static int[] spiralMatrix(int [][]MATRIX) {
        int n = MATRIX.length;
        int m = MATRIX[0].length;
        int[] ans = new int[n*m];

        int left = 0, right = m-1;
        int top =0, bottom = n-1;
        
        int index =0;

        while(left <= right && top <= bottom){
            // right
            for(int i =left; i<=right;i++ ){
                ans[index++] = MATRIX[top][i];
            }
            top++;

            //down
            for(int i=top; i<=bottom; i++){
                ans[index++]= MATRIX[i][right];
            }
            right--;

            //left
            if(top <=bottom){
            for(int i=right; i>=left; i--){
                ans[index++] = MATRIX[bottom][i];
            }
            bottom--;
            }

            // up
            if(left<=right){
            for(int i=bottom; i>=top;i--){
                ans[index++] = MATRIX[i][left];
            }
            left++;
            }
        }
        return ans;
    }
}