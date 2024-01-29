// ______________________________________________________ time complexity- O(n), space complexity- O(1)
import java.util.*;
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int start = -1;
        int end = -1;

        for(int i=0;i<n;i++){
            if(arr.get(i)==k){
                if(start == -1){
                start = i;
                }
                end=i;  
            }
        }
        int[] sol = {start,end};
        return sol;
    }

};
