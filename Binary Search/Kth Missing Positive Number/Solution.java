// _____________________________________________________________ Time complexity- O(n), space complexity- O(1)
// public class Solution {
//     public static int missingK(int[] arr, int n, int k) {
//         for(int i=0; i<n; i++){
//             if(arr[i]<= k){
//                 k++;
//             }
//             else{
//                 break;
//             }
//         }
//         return k;
//     }
// }


// _______________________________________________________________ Time complexity- O(logn), space complexity- O(1)
public class Solution {
    public static int missingK(int[] arr, int n, int k) {
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start);
            int missing = arr[mid] - (mid+1);
            if(missing < k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        //answer is arr[end]+ more we need. After solving the equation answer comeout to be high+1+k or low+k
        return start+k;
    }
}