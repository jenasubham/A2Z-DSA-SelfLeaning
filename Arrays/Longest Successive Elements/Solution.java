// ________________________________________________________________________ O(N.logN) (due to Sorting)
import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        //sort the given Array
        Arrays.sort(a);

        int curr_count = 0;
        int last_smaller = Integer.MIN_VALUE;
        int max_count = 0;

        for(int i =0; i<a.length; i++){

            if(a[i] == last_smaller+1){
                curr_count++;
                last_smaller = a[i];
                max_count = Math.max(curr_count,max_count);
            }
            else if(a[i] == last_smaller){
                continue;
            }
            else{
                curr_count = 1;
                max_count = Math.max(curr_count,max_count);
                last_smaller = a[i];
            }
        }
        return max_count;
    }
}