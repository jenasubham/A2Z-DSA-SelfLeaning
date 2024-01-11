// ________________________________________________________________________ O(N.logN) (due to Sorting)
// import java.util.*;
// public class Solution {
//     public static int longestSuccessiveElements(int []a) {
//         //sort the given Array
//         Arrays.sort(a);

//         int curr_count = 0;
//         int last_smaller = Integer.MIN_VALUE;
//         int max_count = 1;

//         for(int i =0; i<a.length; i++){

//             if(a[i] == last_smaller+1){
//                 curr_count++;
//                 last_smaller = a[i];
//             }
//             else if(a[i] != last_smaller){
//                 curr_count = 1;
//                 last_smaller = a[i];
//             }
//             max_count = Math.max(curr_count,max_count);
//         }
//         return max_count;
//     }
// }


// _________________________________________________________________________ O(3N)- time complexity, O(N) Space complexity
import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        if(n==0) return 0;

        Set<Integer> set = new HashSet<>();

        //put all the elements into the set;
        for(int i=0;i<n; i++){
            set.add(a[i]);
        }

        // Intialize the longest as 1.
        int  longest = 1;

        for(int i :set){

            int x = i;
            int count = 1;
            // if this is the first element of the sequence then only
            if(! set.contains(i-1)){
                // loop till the last element.
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }

        return longest;
    }
}
