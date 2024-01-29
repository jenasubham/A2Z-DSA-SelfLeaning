// ______________________________________________________ time complexity- O(n), space complexity- O(1)
// import java.util.*;
// public class Solution {

//     public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
//         int start = -1;
//         int end = -1;

//         for(int i=0;i<n;i++){
//             if(arr.get(i)==k){
//                 if(start == -1){
//                 start = i;
//                 }
//                 end=i;  
//             }
//         }
//         int[] sol = {start,end};
//         return sol;
//     }

// };


// _________________________________________________________ time complexity- O(logn), space complexity- O(1)
import java.util.*;
public class Solution {

    static int lowerbound(ArrayList<Integer> arr,int n, int k){
        int lower = n;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr.get(mid)>=k){
                lower = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return lower;
    }

    static int upperbound(ArrayList<Integer> arr, int n, int k){
        int upper = n;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr.get(mid) > k){
                upper= mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return upper;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int lower = lowerbound(arr,n,k);
        int upper = upperbound(arr,n,k);

        if(lower == n || arr.get(lower) != k){
            lower = -1;
            upper = -1;
            int sol[] = {-1,-1};
            return sol;
        }

        int sol[] = {lower,upper-1};
        return sol;
    }

};
