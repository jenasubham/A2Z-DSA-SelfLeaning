// _____________________________________________ Time complexity- O(logn), Space complexity- O(1)
public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        int start= 0;
        int end =  n-1;
        int ans = n;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>= x){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]< x){
                start= mid+1;
            }
        }
        return ans;
    }
}