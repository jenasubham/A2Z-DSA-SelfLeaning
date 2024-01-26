// _____________________________________________ Time complexity- O(logn), Space complexity- O(1)
public class Solution {
    public static int binarySearch(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target < arr[mid]){
            return binarySearch(arr, start, mid-1, target);
        }
        else{
            return binarySearch(arr,mid+1, end, target);
        }
    }
    public static int search(int []arr, int target) {
        int length = arr.length;
        return binarySearch(arr, 0, length-1, target);
    }
}