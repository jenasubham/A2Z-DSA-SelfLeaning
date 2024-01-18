// ________________________________________________________ Time complexity-> O(N^2), Space complexity-> O(1)
public class Solution {
    public static void rotateMatrix(int [][]matrix){
        int n = matrix.length;
        
        // Transverse the matrix
        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse every row
        for(int i=0; i<n;i++){
            int first = 0;
            int last = n-1;
            while(first < last){
                int temp = matrix[i][first];
                matrix[i][first] = matrix[i][last];
                matrix[i][last] = temp; 

                first++;
                last--;
            }
        }

    }
}