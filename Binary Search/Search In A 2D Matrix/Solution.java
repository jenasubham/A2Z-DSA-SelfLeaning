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
// import java.util.ArrayList;
// public class Solution {
//     static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
//         int n = mat.size();
//         int m = mat.get(0).size();

//         for(int row=0; row<n; row++){
//             if(mat.get(row).get(0) <= target && target <= mat.get(row).get(m-1)){
//                 for(int col=0; col<m; col++){
//                     if(mat.get(row).get(col)== target){
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;
//     }
// }




// _________________________________________________________ time complexity- O(n) + log(m), space complexity- O(1)

// import java.util.ArrayList;
// public class Solution {
    
//     public static boolean binarySearch(ArrayList<Integer> arr, int target){
//         int start = 0;
//         int end = arr.size() -1;

//         while(start<= end){
//             int mid = start + (end-start)/2;

//             if(arr.get(mid) == target){
//                 return true;
//             }
//             else if(target < arr.get(mid)){
//                 end = mid-1;
//             }
//             else{
//                 start = mid+1;
//             }
//         }
//         return false;
//     }
    
//     static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
//         int n = mat.size();
//         int m = mat.get(0).size();
//         for(int row=0; row<n; row++){
//             if(mat.get(row).get(0) <= target && target <= mat.get(row).get(m-1)){
//                     return binarySearch(mat.get(row), target);
//             }
//         }
//         return false;
//     }
// }



// _________________________________________________________________________ time complexity- log(n*m), space complexity- O(1)

import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int n = mat.size();
        int m = mat.get(0).size();
        int length = n*m;

        int start = 0; 
        int end = length-1;

        //apply binary search:
        while(start <= end){
            int mid = start + (end- start)/2;

            int row = mid/m;
            int col = mid%m;

            if(target == mat.get(row).get(col)) return true;

            else if( target < mat.get(row).get(col)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
