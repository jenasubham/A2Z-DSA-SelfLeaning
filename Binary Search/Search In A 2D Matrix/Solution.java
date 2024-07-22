// ___________________________________________________________ time complexity- O(n*m), space complexity- O(1)
// import java.util.ArrayList;
// public class Solution {
//     static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
//         int n = mat.size();
//         int m = mat.get(0).size();
//         for(int row = 0; row< n; row++){
//             for(int col = 0; col<m; col++){
//                 if(mat.get(row).get(col) == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// ___________________________________________________________ time complexity- O(n + m), space complexity- O(1)
import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int n = mat.size();
        int m = mat.get(0).size();

        for(int row=0; row<n; row++){
            if(mat.get(row).get(0) <= target && target <= mat.get(row).get(m-1)){
                for(int col=0; col<m; col++){
                    if(mat.get(row).get(col)== target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
