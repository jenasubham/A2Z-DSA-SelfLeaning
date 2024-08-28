// _________________________________________________________ time complexity- O(n) + log(m), space complexity- O(1)
public class Solution {

    // binary search on a row
    public static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }

    public static boolean searchElement(int [][]MATRIX, int target) {
        int rows = MATRIX.length -1;
        int cols = MATRIX[0].length -1;
        for(int i = 0; i <= rows; i++){
            if(MATRIX[i][0] <= target && target <= MATRIX[i][cols]){
                return binarySearch(MATRIX[i], target);
            }
        }
        return false;
    }
}


