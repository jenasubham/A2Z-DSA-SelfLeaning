// ____________________________________________________________ time complexity- O(max-min)*O(n), space complexity- O(1)
// import java.util.*;
// public class Solution {

//     static boolean canPlace(int[] stalls, int minDis, int cows){
//         int cowPlaced = 1; 
//         int last = stalls[0];

//         for(int j=1; j<stalls.length; j++){
//             int dis = stalls[j]- last;
//             if(dis>= minDis){
//                 cowPlaced++;
//                 last = stalls[j];
//             }
//             if(cowPlaced >= cows) return true;
//         }

//         return false;

//     }
//     public static int aggressiveCows(int []stalls, int k) {
//         int n = stalls.length;

//         Arrays.sort(stalls);
        
        
//         int limit = stalls[n-1] - stalls[0];
//         for(int i=1; i<= limit; i++){
//             if(canPlace(stalls, i, k) == false){
//                 return (i-1);
//             }
            
//         }

//         return limit;

//     }
// }


// ____________________________________________________________ time complexity- O(n * log(max-min)), space complexity- O(1)
import java.util.*;
public class Solution {
    static boolean canPlace(int[] stalls, int minDis, int cows){
        int cowPlaced = 1; //no. of cows placed
        int last = stalls[0]; //position of last placed cow.

        for(int i=0; i<stalls.length; i++){
            int dis = stalls[i] - last;
            if(dis >= minDis){
                cowPlaced++; //place next cow.
                last = stalls[i]; //update the last location where the cow placed
            }
            if(cowPlaced>= cows) return true;
        }

        return false;
    }

    public static int aggressiveCows(int []stalls, int k) {
        int n = stalls.length;
        //sort the stalls array
        Arrays.sort(stalls);

        int start = 1;
        int end = stalls[n-1] - stalls[0];

        // Apply binary Search on the possible answers
        while(start<= end){
            int mid = start+ (end-start)/2;

            if(canPlace(stalls, mid, k)== true){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return end;

    }
}