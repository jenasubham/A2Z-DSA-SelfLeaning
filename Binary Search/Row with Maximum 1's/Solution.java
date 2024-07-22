// ___________________________________________________________________________ time complexity- O(n*logm), space complexity- O(1)
import java.util.ArrayList;
public class Solution {
    public static int lowerbound(ArrayList<Integer> arr, int x){
        int n = arr.size();
        int start = 0;
        int end = n-1;
        int ans = n;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr.get(mid)>= x){
                end = mid-1;
                ans = mid;
            }
            else{
                start = mid+1;
            }
        }
        return ans;

    }

    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int curr_max = 0;
        int index = -1;
        for(int row=0; row< mat.size();row++){
           int curr_ones = m - lowerbound(mat.get(row), 1);
           if(curr_ones > curr_max){
               curr_max = curr_ones;
               index = row;
           }
        }

        return index;
    }
}