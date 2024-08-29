// ______________________________________________________ time complexity- O(n), space complexity- O(1)
// import java.util.ArrayList;
// public class Solution {
//     public static int findPeakElement(ArrayList<Integer> arr) {
//         int n = arr.size();
//         for(int i=0; i<n; i++){
//             if(i==0 && arr.get(i)>arr.get(i+1)){
//                 return i;
//             }
//             else if(i==n-1 && arr.get(i)>arr.get(i-1)){
//                 return i;
//             }
//             else{
//                 if(arr.get(i)>arr.get(i+1) && arr.get(i)> arr.get(i-1)){
//                     return i;
//                 }   
//             }
//         }
//         return -1;
//     }
// };



// ______________________________________________________________________ time complexity- O(logN), space complexity- O(1)

import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();

        //Edge cases
        if(n==1) return arr.get(0);
        if(arr.get(0)> arr.get(1)) return 0;
        if(arr.get(n-1)> arr.get(n-2)) return n-1;


        int start = 1;
        int end = n-2;

        while(start<=end){
            int mid = start+(end-start)/2;

            //if mid is the peak element
            if(arr.get(mid)> arr.get(mid-1) && arr.get(mid)>arr.get(mid+1)){
                return mid;
            }
            //if the array is increasing, then we are in the left half and peak is in the right half
            else if(arr.get(mid)> arr.get(mid-1)){
                start = mid+1;
            }
            // we are in the right half and peak in the left half
            else{
                end = mid-1;
            }
        }
        return -1;
    }
};
