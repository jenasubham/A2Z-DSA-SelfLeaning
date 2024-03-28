public class Solution {
    public static int findMin(int []arr) {
        int start = 0;
        int end = arr.length -1;
        int ans = Integer.MAX_VALUE;

        while(start<= end){
            int mid = (start+end)/2;
            //if already sorted
            if(arr[start]<= arr[end]){
                ans = Math.min(ans, arr[start]);
                break;
            }
            
            //left side sorted
            if(arr[start]<=arr[mid]){
                ans = Math.min(ans,arr[start]);
                start = mid+1;
            }
            //right side sorted
            else{
                ans = Math.min(ans, arr[mid]);
                end = mid-1;
            }
        }
        return ans;
    }
}