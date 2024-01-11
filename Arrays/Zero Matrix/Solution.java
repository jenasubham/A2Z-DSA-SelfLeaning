// ____________________________________________________________ TIme complexity-> n*m*(n+m) + n*m
import java.util.* ;
public class Solution {
    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int i, int m, int n){
        for(int j=0; j<m; j++){
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j,-1);
            }
        }
    }

    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int j, int m, int n){
        for(int i=0; i<n; i++){
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	for(int i=0;i<n; i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j) == 0){
                    markRow(matrix,i,m,n);
                    markCol(matrix,j,m,n);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j,0);
                }
            }
        }

        return matrix;
    }
}