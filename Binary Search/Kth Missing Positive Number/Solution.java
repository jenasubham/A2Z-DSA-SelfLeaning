// _____________________________________________________________ Time complexity- O(n), space complexity- O(1)
public class Solution {
    public static int missingK(int[] arr, int n, int k) {
        for(int i=0; i<n; i++){
            if(arr[i]<= k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}