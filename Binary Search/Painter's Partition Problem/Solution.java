// ____________________________________________________________ time complexity- O(N * (Sum- max)), space complexity- O(1)
// import java.util.ArrayList;
// public class Solution {
//     // Function for calculating no. of Painters with a time
//     public static int countPainters(ArrayList<Integer> boards, int maxTime){
//         int painters = 1;
//         int boardsPainter = 0;
//         for(int i=0; i< boards.size(); i++){
//             if(boardsPainter+ boards.get(i) <= maxTime){
//                 // allocate board to current painter
//                 boardsPainter += boards.get(i);
//             }
//             else{
//                 // allocate board to next painter
//                 painters++;
//                 boardsPainter = boards.get(i);
//             }
//         }
//         return painters;
//     }

//     public static int findLargestMinDistance(ArrayList<Integer> boards, int k){
//         int start = Integer.MIN_VALUE;
//         int end = 0;

//         for(int ele:boards){
//             start = Math.max(start, ele);
//             end += ele;
//         }

//         for(int maxTime = start; maxTime<= end; maxTime++){

//             if(countPainters(boards, maxTime) == k){
//                 return maxTime;
//             }
//         }
//         return start;
//     }
// }


// ____________________________________________________________ time complexity- O(N * log(Sum- max)), space complexity- O(1)
import java.util.ArrayList;

public class Solution {
    // Function for calculating no. of Painters with a time
    public static int countPainters(ArrayList<Integer> boards, int maxTime){
        int painters = 1;
        int boardsPainter = 0;
        for(int i=0; i< boards.size(); i++){
            if(boardsPainter+ boards.get(i) <= maxTime){
                // allocate board to current painter
                boardsPainter += boards.get(i);
            }
            else{
                // allocate board to next painter
                painters++;
                boardsPainter = boards.get(i);
            }
        }
        return painters;
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k){
        int start = Integer.MIN_VALUE;
        int end = 0;
        //calculating the sum and max element of the Array. 
        for(int ele:boards){
            start = Math.max(start, ele);
            end += ele;
        }

        while(start<= end){
            int mid = start+ (end-start)/2;

            if(countPainters(boards, mid) > k){
                start = mid+1;
            }
            else{
               end = mid-1; 
            }
        }
        return start;
    }
}